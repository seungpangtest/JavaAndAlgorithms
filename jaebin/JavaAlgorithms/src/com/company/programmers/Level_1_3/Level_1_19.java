package com.company.programmers.Level_1_3;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 레벨 1 : 같은 숫자는 싫어
public class Level_1_19 {
    public static void main(String[] args) {
        int n[] = {1, 1, 3, 3, 0, 1, 1};
        solution(n);

    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        int temp = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                list.add(index, arr[i]);
                temp = arr[i];
                index++;
                continue;
            }
            if (arr[i] == temp) {
                continue;
            } else {
                list.add(index, arr[i]);
                temp = arr[i];
                index++;
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
