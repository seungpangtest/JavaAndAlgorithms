package com.company.study_4_Recursion;

import java.util.Arrays;
import java.util.Scanner;

//백준 18511번 : 재귀, 큰 수 구성하기
public class BigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[k];
        for (int i = 0; i < a.length; i++) {
            //1 5 7
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int max = Integer.MIN_VALUE;
        //657, a, i==0, max
        max = rec(n, a, max, 0);
        System.out.println(max);
    }

    // 전략:
    public static int rec(int n, int[] a, int max, int now) {
        if (now > n) return max;
        if (now > max){
            max = now;
        }
        for (int i = a.length - 1; i >= 0; i--) {
            max = rec(n, a, max, now * 10 + a[i]);
        }
        return max;
    }
}
