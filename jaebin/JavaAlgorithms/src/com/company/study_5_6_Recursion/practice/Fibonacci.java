package study_4_Recursion.practice;

import java.util.Scanner;

//백준  10870번 : 재귀, 피보나치
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Fi(n);
        System.out.println(result);
    }

    public static int Fi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fi(n - 1) + Fi(n - 2);
        }
    }
}
