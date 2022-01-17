package com.company.baekjoon.basic;

import java.util.Scanner;

//백준 2920번 : 구현, 음계
public class Scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test1[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int test2[] = {8, 7, 6, 5, 4, 3, 2, 1};

        int test3 = 0;

        for (int i = 1; i <= 8; i++) {
            int n = sc.nextInt();
            if (n == test1[i - 1]) {
                test3++;
            } else if (n == test2[i - 1]) {
                test3--;
            }
        }
        if (test3 == 8) {
            System.out.println("ascending");
        } else if (test3 == -8) {
            System.out.println("descending");
        } else System.out.println("mixed");
    }
}
