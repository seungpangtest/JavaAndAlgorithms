package com.company.programmers.Level_1_3;

//프로그래머스 레벨1: 서울에서 김서방 찾기
public class Level_1_23 {
    public static void main(String[] args) {
        String[] a = {"Jane", "Kim"};
        solution(a);
    }

    public static String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
}
