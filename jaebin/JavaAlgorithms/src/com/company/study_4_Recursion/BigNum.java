package com.company.study_4_Recursion;

import java.util.Scanner;

//백준 18511번 : 재귀, 큰 수 구성하기
public class BigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[k];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        rec(n, a, 0, max);
    }

    public static void rec(int n, int[] a, int i, int max) {
        if (String.valueOf(max).length() <= String.valueOf(n).length()) {
            if (n < max) {
                return;
            }
        }
        if (max < 10) {
            max = a[i];
        }

        max += 10 * a[i];
        rec(n, a, i + 1, max);

        return;
    }
}
