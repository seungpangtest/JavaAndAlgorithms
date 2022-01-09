package com.company.programmers.stack_queue;

import java.util.*;

//프로그래머스 레벨2 : 큐, 다리를 지나는 트럭
public class Stack_1_3 {
    public static void main(String[] args) {
        int b = 2;
        int w = 10;
        int[] a = {7, 4, 5, 6};
        solution(b, w, a);
    }

    // 다리길이, 다리 버티는 무게, 트럭의 무게들
    // 1초(경과시간)에 bridge_length 만큼 움직인다는 부연설명이 없었다.
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        //경과시간
        int answer = 0;
        //다리를 건너는 중인 트럭
        Queue<Integer> p_que = new LinkedList<>();
        //다리를 지난 트럭
        ArrayList<Integer> e_list = new ArrayList<>();
        //대기 트럭
        ArrayList<Integer> w_list = new ArrayList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            w_list.add(truck_weights[i]);
        }

        for (int i = 0; i < bridge_length; i++) {
            p_que.add(0);
        }
        //다리를 지난 트럭, 다리를 건너는 트럭, 경과 시간, 대기트럭
        while (true) {
            int sum = 0;
            //p_que의 모든값을 출력하여 더하기 위해 Iterator 클래스 사용.
            sum = check(p_que);
            if (sum == 0) {
                p_que.poll();
                p_que.offer(w_list.get(0));
                w_list.remove(0);
                answer++;
                continue;
            }

            if (p_que.peek() > 0) {
                e_list.add(p_que.poll());
                if (w_list.isEmpty()) {
                    if (check(p_que) > 10) {
                        p_que.offer(0);
                        answer++;
                        continue;
                    }
                } else {
                    if (check(p_que) + w_list.get(0) > 10) {
                        p_que.offer(0);
                        answer++;
                        continue;
                    }
                }

                p_que.offer(w_list.get(0));
                w_list.remove(0);
            } else {
                p_que.poll();
                if (w_list.isEmpty()) {
                    if (check(p_que) > 10) {
                        p_que.offer(0);
                        answer++;
                        continue;
                    }

                } else {
                    if (check(p_que) + w_list.get(0) > 10) {
                        p_que.offer(0);
                        answer++;
                        continue;
                    }
                }
                p_que.offer(w_list.get(0));
                w_list.remove(0);
            }
            answer++;
            if (e_list.size() == truck_weights.length) {
                break;
            }
        }
        return answer;
    }

    // 큐안에 있는 모든 값을 더한 값이 10이 넘는지를 확인하기 위한 메소드
    public static int check(Queue p_que) {
        int sum = 0;
        Iterator iterator = p_que.iterator();
        while (iterator.hasNext()) {
            sum += Integer.parseInt(iterator.next().toString());
        }
        return sum;
    }
}
