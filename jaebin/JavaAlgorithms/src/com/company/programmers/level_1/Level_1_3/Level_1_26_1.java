package com.company.programmers.level_1.Level_1_3;

import java.util.Arrays;
import java.util.Comparator;

//프로그래머스 레벨 1 :문자열 내 마음대로 정렬하기, Comparator를 Override하여 사용.
public class Level_1_26_1 {
    public static void main(String[] args) {
        String[] a = {"sun", "bed", "car"};
        int n = 1;
        solution(a, 1);
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return o1.charAt(n) - o2.charAt(n);
            }
        });

        answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i];
            System.out.println(answer[i]);
        }
        return answer;
    }
}
