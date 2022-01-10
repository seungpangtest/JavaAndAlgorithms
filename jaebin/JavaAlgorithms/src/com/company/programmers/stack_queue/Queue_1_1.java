package com.company.programmers.stack_queue;

import java.util.*;

//프로그래머스 레벨2 : 큐, 다리를 지나는 트럭
public class Queue_1_1 {
    public static void main(String[] args) {
        int b = 100;
        int w = 100;
        int[] a = {10,10,10,10,10,10,10,10,10,10};
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
//        for (int i = 0; i < bridge_length; i++) {
//            p_que.add(0);
//        }
        // 다리를 건너는 중인 트럭의 무게 합
        int sum = 0;


        while (true) {
            if (e_list.contains(0)) {
                for (int i = 0; i < e_list.size(); i++) {
                    if (e_list.get(i) == 0) {
                        e_list.remove(i);
                    }
                }
            }

            if (e_list.size() != truck_weights.length) {
                int truck = 0;
                if (w_list.size() != 0) {
                    truck = w_list.get(0);
                } else break;

                //초기 다리를 건너는 중이 트럭이 없을때,
                if (p_que.isEmpty()) {
                    p_que.offer(truck);
                    w_list.remove(0);
                    sum += truck;
                    answer++;
                    continue;
                } else if (p_que.size() == bridge_length) { // 다리에 건너는 중인 트럭이 다찼을때 -> 맨 앞 트럭이 나와야한다.
                    int size = p_que.poll();
                    e_list.add(size);
                    sum -= size;
                    if (sum + truck <= weight) {
                        p_que.offer(truck);
                        w_list.remove(0);
                        sum += truck;
                        answer++;
                        continue;
                    } else {
                        p_que.offer(0);
                        answer++;
                        continue;
                    }
                } else { // sum과 검사하여 트럭을 넣고 뺀다.
                    if (sum + truck <= weight) {
                        p_que.offer(truck);
                        w_list.remove(0);
                        sum += truck;
                        answer++;
                        continue;
                    } else {
                        p_que.offer(0);
                        answer++;
                        continue;
                    }
                }
            } else break;
        }
        answer += bridge_length;
        System.out.println(answer);
        return answer;
    }

    // 큐안에 있는 모든 값을 더한 값이 10이 넘는지를 확인하기 위한 메소드
//    public static int check(Queue p_que) {
//        int sum = 0;
//        Iterator iterator = p_que.iterator();
//        while (iterator.hasNext()) {
//            sum += Integer.parseInt(iterator.next().toString());
//        }
//        return sum;
//    }
}
