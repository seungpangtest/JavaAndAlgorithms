package study_4_Recursion.practice;

import java.util.Scanner;

//백준 10872번 : 재귀, 팩토리얼
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fac = fac(n);
        System.out.println(fac);
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 1) {
            return n;
        } else {
            return fac(n - 1) * n;
        }
    }
}
