package com.company.programmers.level_1.Level_1_3;

import java.util.HashSet;

//프로그래머스 레벨 1: 폰켓몬
public class Level_1_28 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 3};
        solution(a);
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int en = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() >= en) answer = en;
        else answer = set.size();

        return answer;
    }
}
