package baekjoon.string;

import java.util.Scanner;

//백준 2675번 : 문자열 반복
public class String_1_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int t = 0; t < a; t++) {
            int n = sc.nextInt();
            String s = sc.next();
            String p = "";
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < n; j++) {
                    p = p + s.charAt(i);
                }
            }
            System.out.println(p);

        }
    }
}
