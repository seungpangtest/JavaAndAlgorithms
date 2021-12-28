package baekjoon.math_1;

import java.util.Scanner;

//백준 2839번: 수학 , 설탕배달
public class Math_1_7 {
    public static int n = 0;
    public static int min = 0; //봉지의 최소개수는??

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //n킬로그램 , 18

        while (n > 2) {
            if (n % 5 == 0) {
                min += n / 5;
                break;
            }else {
                n -= 3;
                min++;
                continue;
            }
        }
        if (n < 3 && n > 0) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }

}
