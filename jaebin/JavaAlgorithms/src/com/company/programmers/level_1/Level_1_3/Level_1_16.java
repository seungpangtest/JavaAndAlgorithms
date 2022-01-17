package com.company.programmers.level_1.Level_1_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//프로그래머스 레벨 1 : 두 개 뽑아서 더하기
public class Level_1_16 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        solution(numbers);
        System.out.println(solution(numbers));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> hashSet = new HashSet<>();
        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>(hashSet);
        Collections.sort(arr);

        answer = new int[hashSet.size()];
        for (int i = 0; i < hashSet.size(); i++) {
            answer[i] = arr.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }
}
