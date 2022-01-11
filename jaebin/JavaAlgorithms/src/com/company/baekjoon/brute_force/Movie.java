package com.company.baekjoon.brute_force;

import java.util.ArrayList;
import java.util.Scanner;

//백준 알고리즘 1436번 : 브루트포스, 영화감독 숌
public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 666;
        int a = 1;

        String answer = find(n, a, s);
        System.out.println(answer);
    }

    public static String find(int n, int a, int s) {
        String result = "";
        ArrayList<Integer> arr = new ArrayList<>();
        //contains 사용
        for (int i = 1; i <= a; i++) {
            if (String.valueOf(a).contains(String.valueOf(s))) {
                arr.add(i);
                if (arr.size() == n) {
                    break;
                }
                a++;
                continue;
            }
            a++;
        }
        result = String.valueOf(arr.get(n-1));
        return result;
    }
}
