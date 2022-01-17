package com.company.programmers.level_1.level_1_1;

//프로그래머스 레벨1 : kakao , 숫자 문자열과 영단어
public class Level_1_9_1 {
    public static void main(String[] args) {
        String s = "23four5six7";
        System.out.println(solution(s));
    }

    //전략 : 1. 배열에 영단어를 넣고 contains 로 확인한다. 2.받은 문자열을 replace로 숫자인 문자열로 변환. 3.받은 문자열을 charAt으로 하나하나 검사(좋지않음.)
    //1번을 이용하여 풀었음.
    public static int solution(String s) {
        int answer = 0;
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < words.length; i++) {
            if (s.contains(words[i]) == true) {
                s = s.replace(words[i], nums[i]);
            }else continue;
        }
        answer = Integer.parseInt(s);
        return answer;

    }
}
