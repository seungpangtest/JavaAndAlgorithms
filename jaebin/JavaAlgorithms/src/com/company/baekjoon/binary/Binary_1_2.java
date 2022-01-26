package com.company.baekjoon.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 1920번 : 수 찾기 - 이분탐색 : 배열이 무조건 정렬 되어 있어야 한다.
public class Binary_1_2 {
    static int a[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m = Integer.parseInt(br.readLine());
        s = br.readLine();
        st = new StringTokenizer(s, " ");
        int result[] = new int[m];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            // 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
            if (binarySearch(result[i]) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int key) {
        int lo = 0; // 왼쪽 끝 인덱스
        int hi = a.length - 1; // 오른쪽 끝 인덱스

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
