package baekjoon.number_theory;

import java.util.Scanner;

//백준 5086번 : 정수론과 조합론, 배수와약수
public class Number_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int result = 0;
            result = check(a, b);
            if (result == 1) {
                System.out.println("factor");

            } else if (result == 2) {
                System.out.println("multiple");

            } else {
                System.out.println("neither");
            }
        }
    }

    public static int check(int a, int b) {
        int result = 0;
        if (b % a == 0) {
            result = 1;
        } else if (a % b == 0) {
            result = 2;
        } else {
            result = 3;
        }
        return result;
    }
}
