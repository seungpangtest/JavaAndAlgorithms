package com.company.programmers.stack_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//프로그래머스 레벨2: 스택, 기능개발
public class Stack_1_2 {
    public static void main(String[] args) {
        int[] a = {93, 30, 55};
        int[] b = {1, 30, 5};
        solution(a, b);
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        //push : stack에 값을 추가
        for (int i = progresses.length - 1; i >= 0; i--) {
            stk.push(progresses[i]);
        }
//        System.out.println(stk);
        //set(i,값) : 해당 인덱스 i에 스택 값 변경
        //elementAt(i) : 해당 인덱스 i에 값 확인
        int j = 0;
        int cnt = 0;
        while (true) {
            if (stk.empty()) {
                break;
            }
            if (stk.peek() >= 100) {
                while (stk.peek() >= 100) {
                    cnt++;
                    if (cnt == 1) result.add(j, cnt);
                    else result.set(j, cnt);
                    stk.pop();
                    if (stk.empty()) break;
                }
                cnt = 0;
                j++;
//                System.out.println(stk);
//                System.out.println(stk.pop());
                continue;
            }
            // n 째날 돌리기
            // 55 30 93
            // 1 30 5
            for (int i = 0; i < stk.size(); i++) {
                stk.set(i, stk.elementAt(i) + speeds[progresses.length - 1 - i]);
            }

        }
//        System.out.println(stk);
        answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
//            System.out.println(answer[i]);
        }
        return answer;
    }
}
