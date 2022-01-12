package com.company.baekjoon.string;

import java.io.*;
import java.util.Stack;

//백준 1259번 : 문자열,구현 팰린드롬수
public class String_1_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        while (true) {
            String s = br.readLine();
            int len = s.length();
            int n = Integer.parseInt(s);
            if (n == 0) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                stk1.push(Character.getNumericValue(s.charAt(i)));
            }
            //w 까지 잘라야함.
            int w = len / 2;
            //짝수
            if (len % 2 == 0) {
                for (int i = len - 1; i >= w; i--) {
                    stk2.push(stk1.pop());
                }
            } else {
                for (int i = len - 1; i >= w; i--) {
                    if (i == w) {
                        stk1.pop();
                    } else
                        stk2.push(stk1.pop());
                }
            }
//            System.out.println(stk1);
//            System.out.println(stk2);
            if (stk1.equals(stk2)) {
                bw.write("yes" + "\n");
                bw.flush();
            } else {
                bw.write("no" + "\n");
                bw.flush();
            }
            stk1.clear();
            stk2.clear();
        }
        bw.close();
    }
}
