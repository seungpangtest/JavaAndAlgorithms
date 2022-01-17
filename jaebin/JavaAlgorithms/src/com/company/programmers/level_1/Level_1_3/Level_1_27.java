package com.company.programmers.level_1.Level_1_3;

import java.util.ArrayList;

//프로그래머스 레벨1 : 3진법 뒤집기
public class Level_1_27 {
    public static void main(String[] args) {
        int n = 125;
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int idx = 0;
        while (true) {
            if (n / 3 == 0) {
                arr.add(n % 3);
                break;
            }
            arr.add(n % 3);
            n = n / 3;
        }
        int a = arr.size() - 1;
        while (true) {
            if (idx == arr.size()) break;
            answer += arr.get(idx) * Math.pow(3, a);
            idx++;
            a--;
        }
        System.out.println(answer);
        return answer;
    }
}
