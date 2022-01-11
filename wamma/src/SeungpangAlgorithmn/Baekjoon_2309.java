package SeungpangAlgorithmn;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2309 { //일곱난쟁이 의 키 합은 100 , 9명중 가짜 2명을 찾아야됨
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] += sc.nextInt();
            sum += array[i];
        }
        Arrays.sort(array);
        //20 7 23 19 10 15 25 8 13
        //7 8 10 13 15 19 20 23 25
        boolean f = false;
        for (int i = 0; i < array.length; i++) {
            if(f) break;
            //for문 두개 돌려서 sum - (a[i] + a[j]) == 100 이면 스탑
            for (int j = i + 1; j < array.length; j++) {
                if (sum - (array[i] + array[j]) == 100) {
                    array[i] = 0;
                    array[j] = 0;
                    f = true;
                    break;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) continue;
            else System.out.println(array[i]);
        }
    }
}
