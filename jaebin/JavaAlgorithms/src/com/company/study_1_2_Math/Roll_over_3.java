package study_1_Math;

import java.io.*;
import java.util.Stack;

public class Roll_over_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            Stack<Character> stack = new Stack<>();
            String s = bf.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    while (!stack.empty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(" ");
                } else {
                    stack.add(s.charAt(j));
                }
            }
            while(!stack.empty()) {
                bw.write(stack.pop());
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
