package com.company.programmers.greedy;

import java.util.ArrayList;

//프로그래머스 레벨2 : 그리디, 큰수 만들기
public class BigNum {
    public static void main(String[] args) {
        String nu = "1924";
        int k = 2;
        solution(nu, k);
    }

    // k개의 숫자를 제거하고 만들 수 조합중에 가장 큰수
    public static String solution(String number, int k) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            arr.add(String.valueOf(number.charAt(i)));
        }
        ArrayList<String> result = new ArrayList<>();
        rec(arr, 0, k, result);

        for (int i = 0; i < result.size(); i++) {
            answer += result.get(i);
        }
        System.out.println(answer);
        return answer;
    }

    //string
    public static void rec(ArrayList<String> arr, int start, int k, ArrayList<String> result) {
        int len = arr.size();
        int n = len - k - 1;
        if (n == -1) {
            return;
        }
        String s = "";
        String max = "-1";
        ArrayList<Integer> idx = new ArrayList<>();

        for (int i = start; i < len - n; i++) {
            if (Integer.parseInt(arr.get(i)) > Integer.parseInt(max)) {
                max = arr.get(i);
                idx.add(i);
            }
        }
        start = idx.get(idx.size() - 1) + 1;
        k++;
        result.add(max);

        rec(arr, start, k, result);
        return;
    }
}
