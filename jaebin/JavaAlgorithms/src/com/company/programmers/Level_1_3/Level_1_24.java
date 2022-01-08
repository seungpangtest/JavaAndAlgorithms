package com.company.programmers.Level_1_3;

//프로그래머스 레벨 1 :부족한 금액 계산하기
public class Level_1_24 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        solution(price, money, count);
    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        answer = sum - money;
        if (answer < 0) {
            answer = 0;
        }
        return answer;
    }
}
