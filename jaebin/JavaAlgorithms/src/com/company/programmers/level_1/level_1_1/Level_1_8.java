package com.company.programmers.level_1.level_1_1;

//프로그래머스 레벨1 : kakao , 비밀지도
public class Level_1_8 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        System.out.println(solution(n, arr1, arr2));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = check(arr1[i], arr2[i], n);
        }
        return answer;
    }

    public static String check(int a, int b, int n) {
        String sum = "";
        String result = "";
        int AorB = a | b;
        // 9 30  -> 31
        // 1 -> 000001

        sum = Integer.toBinaryString(AorB);
        int len = sum.length();//1
        if (len < n) {
            for (int i = 0; i < n - len; i++) {
                sum = "0" + sum;
            }
        }
//        System.out.println(sum);
        for (int i = 0; i < n; i++) {
            if (sum.charAt(i) == '1') {
                result += "#";
            } else {
                result += " ";
            }
        }
        return result;
    }
}
