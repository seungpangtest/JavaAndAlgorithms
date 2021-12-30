package programmers.level1_4;

import java.util.HashMap;

//프로그래머스 레벨1 : kakao , 숫자 문자열과 영단어
public class Level_1_2 {
    public static void main(String[] args) {
        String s = "23four5six7";
        solution(s);
        System.out.println(solution(s));
    }
    //전략 : 1. 배열에 영단어를 넣고 contains 로 확인한다. 2.받은 문자열을 replace로 숫자인 문자열로 변환
    public static int solution(String s) {
        int answer = 0;
        String s1 = "";
        String s2 = "";
        String s3 = "";
        HashMap<String , Integer> hs = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            s1 = String.valueOf(s.charAt(i));
            s3 = s3 + s1;
            switch (s3) {
                case "zero":
                    s2 += "0";
                    s3 = "";
                    continue;
                case "one":
                    s2 += "1";
                    s3 = "";
                    continue;
                case "two":
                    s2 += "2";
                    s3 = "";
                    continue;
                case "three":
                    s2 += "3";
                    s3 = "";
                    continue;
                case "four":
                    s2 += "4";
                    s3 = "";
                    continue;
                case "five":
                    s2 += "5";
                    s3 = "";
                    continue;
                case "six":
                    s2 += "6";
                    s3 = "";
                    continue;
                case "seven":
                    s2 += "7";
                    s3 = "";
                    continue;
                case "eight":
                    s2 += "8";
                    s3 = "";
                    continue;
                case "nine":
                    s2 += "9";
                    s3 = "";
                    continue;
                case "0":
                    s2 += "0";
                    s3 = "";
                    continue;
                case "1":
                    s2 += "1";
                    s3 = "";
                    continue;
                case "2":
                    s2 += "2";
                    s3 = "";
                    continue;
                case "3":
                    s2 += "3";
                    s3 = "";
                    continue;
                case "4":
                    s2 += "4";
                    s3 = "";
                    continue;
                case "5":
                    s2 += "5";
                    s3 = "";
                    continue;
                case "6":
                    s2 += "6";
                    s3 = "";
                    continue;
                case "7":
                    s2 += "7";
                    s3 = "";
                    continue;
                case "8":
                    s2 += "8";
                    s3 = "";
                    continue;
                case "9":
                    s2 += "9";
                    s3 = "";
                    continue;
                default:
                    continue;
            }
        }
        answer = Integer.parseInt(s2);
        return answer;
    }

//    public static String eWord(String[] a, char b) {
//        String answer = "";
//
//        return "";
//    }
}