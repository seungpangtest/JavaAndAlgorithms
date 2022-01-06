package com.company.programmers.level_1_1;

//프로그래머스 레벨1: kakao , 신규 아이디 추천
public class Level_1_6 {
    public static void main(String[] args) {
        String s = "...!@BaT#*..y.abcdefghijklm";
        solution(s);
        System.out.println(solution(s));
    }

    public static String solution(String new_id) {
        String answer = "";

        // 1단계, new_id 소문자로 치환
        new_id = new_id.toLowerCase();
        // 2단계, 정규표현식을 이용한 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        new_id = new_id.replaceAll("[^\\.\\-_0-9a-z]", "");
        // 3단계, new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        new_id = new_id.replaceAll("[.]+", ".");

        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if (new_id.endsWith(".")) {
                new_id = new_id.substring(0, 14);
            } else {
                new_id = new_id.substring(0, 15);
            }
        }
        if (new_id.length() <= 2) {
            char last = new_id.charAt(new_id.length() - 1);
            while (new_id.length() < 3) {
                new_id += last;
            }

        }
        answer = new_id;
        return answer;

    }

}
