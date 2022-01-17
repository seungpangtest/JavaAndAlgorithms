package com.company.baekjoon.stack_queue;

import java.io.*;
import java.util.Arrays;

//백준 10989번 : 정렬, 수 정렬하기3
public class Stack_1_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        //메모리 초과
//        List<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            arr.add(Integer.parseInt(br.readLine()));
//        }
//        Collections.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append('\n');
        }
        bw.write(sb.toString()+'\n');
        bw.flush();
        bw.close();
    }
}
