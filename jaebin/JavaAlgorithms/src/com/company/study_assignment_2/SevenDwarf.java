package study_assignment_2;

import java.util.Arrays;
import java.util.Scanner;

/*백준 알고리즘 : 2309번 문제 , 브루트 포스*/
public class SevenDwarf {
    public static void main(String[] args) {
        //
        int[] a = new int[9];
        int sum = 0;
//        int[] result = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int b = 0;
        int c = 0;

        loop:
        for (int i=0; i < a.length; i++){
            b = a[i];
            for(int j = i+1; j<a.length; j++){
                c = a[j];
                if(sum - (b+c) == 100){
                    a[i] = 0;
                    a[j] = 0;
                    break loop;
                }
            }

        }

        Arrays.sort(a);
        for(int i=2; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
