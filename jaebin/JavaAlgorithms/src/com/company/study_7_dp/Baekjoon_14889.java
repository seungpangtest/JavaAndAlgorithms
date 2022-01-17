package com.company.study_7_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 14889번 : 브루트포스, 스타트와링크
public class Baekjoon_14889 {
    static int min = Integer.MAX_VALUE;
    static int n;
    static int[][] s;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 총 n명 , 팀원은 n/2명씩
        n = Integer.parseInt(br.readLine());
        s = new int[n][n];
        visit = new boolean[n];
        for (int i = 0; i < s.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < s[i].length; j++) {
                if (st.hasMoreTokens())
                    s[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        c(0, 0);
        System.out.println(min);
    }

    static void c(int idx, int count) {
        //팀원 인원 수가 n/2 씩 되었을 때
        if (count == n / 2) {
            diff();
            return;
        }
        for (int i = idx; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                c(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }

    static void diff() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (visit[i] == true && visit[j] == true) {
                    start += s[i][j] + s[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    link += s[i][j] + s[j][i];
                }
            }
        }
        int dif = Math.abs(start-link);
        if (dif == 0){
            System.out.println(dif);
            System.exit(0);
        }
        min = Math.min(min,dif);
    }
}
