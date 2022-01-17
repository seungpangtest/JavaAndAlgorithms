package com.company.baekjoon.basic;

import java.util.Scanner;

//백준 2475번 : 검증수
public class Verify_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            sum += Math.pow(n, 2);
        }
        System.out.println((int) (sum % 10));
    }
}
