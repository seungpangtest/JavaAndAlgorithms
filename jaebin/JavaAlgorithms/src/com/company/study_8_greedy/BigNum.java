package com.company.study_8_greedy;

//프로그래머스 레벨 2 : 그리디, 큰 수 만들기 (재도전)
public class BigNum {
    public static void main(String[] args) {
        String num = "1924";
        int k = 2;
        solution(num, k);
    }

    public static String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = number.length() - k;

        //탐색할 원소의 첫번째 인덱스
        int index = 0;

        char max;

        //총 제일큰 number.length() - k 개의 글자를 sb에 넣어야함
        for (int i = 0; i < len; i++) { // 1924면 , k = 2 , 2개 짜리 제일 큰수 찾기 시작
            max = '0';
            //탐색하는 범위중에 가장 큰숫자 한개를 뽑아야함
            //탐색범위는 인덱스 ~
            for (int j = index; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    // 다음 인덱스는 지금 j번재 원소 그 다음부터 탐색
                    index = j + 1;
                }
            }
            sb.append(max);
        }
        answer = sb.toString();
        return answer;
    }
}
