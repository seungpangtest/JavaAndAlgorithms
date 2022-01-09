package com.company.programmers.level_1.Level_1_3;

//프로그래머스 레벨1 : 수박수박수박수박수?
public class Level_1_22 {
    public static void main(String[] args) {
        int n = 3;
        solution(n);
        System.out.println(solution(n));
    }

    public static String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }

        }
        return answer;
    }
}
