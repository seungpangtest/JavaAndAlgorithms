package com.company.baekjoon.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 10828번 : 스택, 스택
public class Stack_1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            s[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            switch (s[i]) {
                case "top":
                    if (stk.empty()) {
                        System.out.println(-1);
                    } else System.out.println(stk.peek());
                    continue;
                case "size":
                    System.out.println(stk.size());
                    continue;
                case "empty":
                    if (stk.empty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    continue;
                case "pop":
                    if (stk.empty()) {
                        System.out.println(-1);
                    } else System.out.println(stk.pop());
                    continue;
                default: {
                    String[] result = s[i].split(" ");
                    stk.push(Integer.parseInt(result[1]));
                }
            }
        }
    }

}
