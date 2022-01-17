package study_1_Math;

import java.util.Scanner;

/*백준 6588번 : 골드바흐의 추측*/
public class GoldBarh_1_Success {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        //10  19,37,55 =>3;  ((10/2) +1)/2 =3
        //6 15,33 => 2
        //8 17,35 => 2
        while ((result = sc.nextInt()) != 0) {
            try {
                //result 중 홀수인데 가장 큰 값
                int max = 0;
                //result 중 홀수인데 가장 작은값
                int min = 0;
                int count = ((result / 2) + 1) / 2;
//                System.out.println("count 횟수 : " + count);
                for (int i = 0; i < count; i++) {
                    min = 2 * i + 1;
//                    System.out.println("min은?" + min);
                    max = result - (2 * i + 1);
//                    System.out.println("max는?" + max);
                    if (min == 1) continue;
                    if (decimal(min, max)) {
                        System.out.println((result) + " = " + min + " + " + max);
                        break;
                    } else continue;
                }
            } catch (Exception e) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }

    public static boolean decimal(int a, int b) {
        //true를 만들자!!
        //a가 3
        //b가 5
//        System.out.println("여긴 들어왔니?");
        boolean result1 = true;
        boolean result2 = true;

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                result1 = false;
            }
        }
        for (int i = 2; i * i <= b; i++) {
            if (b % i == 0) {
                result2 = false;
            }
        }
        if ((result1 == true) && (result2 == true)) {
            return true;
        } else {
            return false;
        }
    }
}
