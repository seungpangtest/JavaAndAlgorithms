package com.company.baekjoon.math_2;

import java.util.Scanner;

//백준 11050번 : 수학, 이항계수 1
public class Math_2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = k;
        int ja = 1;
        int mo = 1;
        while (temp > 0) {
            ja *= n;
            mo *= k;
            k--;
            n--;
            temp--;
        }
        System.out.println(ja/mo);
    }
}
