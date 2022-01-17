package com.company.programmers.level_1.Level_1_3;

//프로그래머스 레벨1: 가운데 글자 가져오기
public class Level_1_21 {
    public static void main(String[] args) {
        String s = "qwer";
        System.out.println(solution(s));
        solution(s);
    }

    public static String solution(String s) {
        String answer = "";
        char[] re = s.toCharArray();
        int len = s.length();
        double a = 0;
        double b = 0;
        if (len % 2 != 0) {
            a = Math.floor(len / 2.0);
            answer = String.valueOf(re[(int) a]);
            return answer;
        } else {
            a = Math.floor(len / 2.0 - 1.0);
            b = a + 1.0;
            answer = String.valueOf(re[(int) a]);
            answer += String.valueOf(re[(int) b]);
            return answer;
        }
    }

}
