package com.company.baekjoon.brute_force;

import java.util.Scanner;

/*백준알고리즘 1018번 : 브루트 포스 체스판 다시칠하기*/
public class Chess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
//        boolean[][] s1 = new boolean[n][m];
//        boolean[][] s2 = new boolean[n][m];
        String[][] result1 = {{"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}};
        String[][] result2 = {
                {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}};

        String[][] q = new String[n][m];

        for (int i = 0; i < n; i++) {
            String one = sc.nextLine();
            for (int j = 0; j < m; j++) {
                q[i][j] = String.valueOf(one.charAt(j));
            }
        }

        int N_row = n - 7;
        int M_col = m - 7;
        int cntA = Integer.MAX_VALUE;
        int cntB = Integer.MAX_VALUE;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                int answer = find(i, j, q, result1);
                if (cntA > answer) {
                    cntA = answer;
                }
            }
        }
        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                int answer = find(i, j, q, result2);
                if (cntB > answer) {
                    cntB = answer;
                }
            }
        }

        if (cntA >= cntB) {
            System.out.println(cntB);
        } else {
            System.out.println(cntA);
        }
    }

    public static int find(int x, int y, String s1[][], String s2[][]) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;
        int q = 0;
        int p = 0;

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (!(s1[i][j].equals(s2[q][p]))) {
                    count++;
                }
                p++;
            }
            q++;
            p = 0;
        }

        return count;
    }
}
