package com.company.programmers.Level_1_3;

//프로그래머스 레벨1 : 시저 암호
public class Level_1_18 {
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;

        System.out.println(solution(s, n));
    }

    public static String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray(); // 문자열 문자 배열로 변환

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                if (Character.isUpperCase(arr[i])) { // 해당 문자가 대문자인지 아닌지
                    arr[i] += n;
                    if (arr[i] > 'Z') {
                        arr[i] = (char) ('A' + (arr[i] - 'Z' - 1));
                    }
                } else {
                    arr[i] += n;
                    if (arr[i] > 'z') {
                        arr[i] = (char) ('a' + (arr[i] - 'z' - 1));
                    }
                }
            }
        }

        answer = String.valueOf(arr);
//        char[] alp = new char[26]; //소문자
//        char[] alp2 = new char[26]; // 대문자
//
//        for (int i = 0; i < alp.length; i++) {
//            if (i == 0) {
//                alp[i] = 'a';
//                alp2[i] = 'A';
//                continue;
//            }
//            alp[i] = (char) (alp[i - 1] + 1);
//            alp2[i] = (char) (alp2[i - 1] + 1);
//        }
        return answer;
    }
}
