package com.company.baekjoon.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 1920번 : 수 찾기 - 시간초과
public class Binary_1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            if (st.hasMoreTokens())
                arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int answer[] = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < answer.length; i++) {
            if (st.hasMoreTokens())
                answer[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < answer.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == answer[i]) {
                    answer[i] = 1;
                    break;
                } else cnt++;
            }
            if (cnt == answer.length)
                answer[i] = 0;
            System.out.println(answer[i]);
        }
    }
}
