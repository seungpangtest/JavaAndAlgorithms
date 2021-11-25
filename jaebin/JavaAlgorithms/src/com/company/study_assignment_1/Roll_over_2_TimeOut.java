package study_assignment_1;

import java.util.Scanner;
import java.util.Stack;

/* 백준 9093번,단어 뒤집기 : 스택을 사용 */
public class Roll_over_2_TimeOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCase; i++) {
            Stack stack = new Stack<>();
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    while (!stack.empty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                } else {
                    stack.add(s.charAt(j));
                }
            }
            while(!stack.empty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
        sc.close();
    }
}
