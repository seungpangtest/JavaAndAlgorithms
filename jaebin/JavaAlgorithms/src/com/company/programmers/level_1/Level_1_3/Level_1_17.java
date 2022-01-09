package com.company.programmers.level_1.Level_1_3;

import java.util.ArrayList;
import java.util.Collections;

//프로그래머스 레벨1 : 문자열 내림차순으로 배치하기
public class Level_1_17 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        solution(s);
    }

    public static String solution(String s) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            arr.add(String.valueOf(s.charAt(i)));
        }

        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.size(); i++) {
            answer += arr.get(i);
        }
        return answer;
    }
}
