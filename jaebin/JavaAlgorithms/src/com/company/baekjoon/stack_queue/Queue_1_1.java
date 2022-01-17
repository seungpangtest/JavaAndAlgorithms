package com.company.baekjoon.stack_queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//백준 10845번 : 큐
public class Queue_1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        String s[] = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = br.readLine();

        }
        String last = "";
        for (int i = 0; i < n; i++) {

            switch (s[i]) {
                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;
                case "back": {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(last);
                    }
                    break;
                }
                case "size": {
                    System.out.println(queue.size());
                    break;
                }
                case "empty": {
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                }
                case "pop": {
                    if (queue.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(queue.poll());
                    }
                    break;
                }
                default: {
                    last = s[i].split(" ")[1];
                    queue.offer(last);
                    break;
                }
            }
        }
    }
}
