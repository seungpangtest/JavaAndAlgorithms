package com.company.programmers.level_1_1;

import java.util.ArrayList;

//프로그래머스 레벨1 : 제일 작은 수 제거하기
public class Level_1_15 {
    public static void main(String[] args) {
        int[] n = {4, 3, 2, 1};
        solution(n);
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) {
            answer = new int[arr.length];
        } else {
            answer = new int[arr.length - 1];
        }

        ArrayList<Integer> a1 = new ArrayList<>();

        if (arr.length != 1) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (min == arr[i]) {
                    continue;
                } else {
                    a1.add(arr[i]);
                }
            }
            for (int i = 0; i < a1.size(); i++) {
                answer[i] = a1.get(i);
            }
        } else {
            answer[0] = -1;
        }
        return answer;
    }
}
