package com.company.programmers.Level_1_3;

import java.util.ArrayList;
import java.util.Collections;

//프로그래머스 레벨 1 :문자열 내 마음대로 정렬하기, substring을 사용
public class Level_1_26 {
    public static void main(String[] args) {
        String[] a = {"sun", "bed", "car"};
        int n = 1;
        solution(a, 1);
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            arr.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1);

        }
        return answer;
    }
}
