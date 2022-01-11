package com.company.study_7_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 14501번 : dp와 브루트 포스, 퇴사
public class Leave {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrT = new int[n];
        int[] arrP = new int[n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arrT[i] = Integer.parseInt(s.split(" ")[0]);
            arrP[i] = Integer.parseInt(s.split(" ")[1]);
        }

        int[] dp = new int[n + 1];

        //i(일)+arrT[i](몇일 해야하는지)가 총 n(마지막날)을 넘으면 안됨.
        for (int i = 0; i < n; i++) {
            if (i + arrT[i] <= n) {
                //현재 i에서 상담일(t[i])를 더해 마지막날 범위를 초과하지 않는 경우 dp 배열에 금액(p[i])를 더해준다.
                //결국에 일을 마친 다음날에 전날까지 한 일의 수익과 원래 있었던 수익중 큰값을 남긴다.
                //점화식 : if (i + t[i] <= n) dp[i] = max(dp[i + t[i]], dp[i + t[i]] + p[i])
                dp[i + arrT[i]] = Math.max(dp[i + arrT[i]], dp[i] + arrP[i]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }
        System.out.println(dp[n]);
    }
}
