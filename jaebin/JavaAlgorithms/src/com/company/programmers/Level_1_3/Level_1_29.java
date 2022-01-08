package com.company.programmers.Level_1_3;

import java.util.Arrays;

//프로그래머스 레벨1 : 예산
public class Level_1_29 {
    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        solution(d, budget);
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget){
                break;
            }
            answer++;
        }
        return answer;
    }

}
