package baekjoon.string;

import java.util.ArrayList;
import java.util.Scanner;

//백준 1157: 문자열, 단어공부
public class String_1_5 {
    public static void main(String[] args) {

        char c[] = new char[26];
        char a = 'A';
        for (int i = 0; i < c.length; i++) {
            c[i] = a;
            a++;
        }
        int b[] = new int[26];

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    b[j] += 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < b.length; i++) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        ArrayList<Character> ac = new ArrayList<>();
        loop:
        for (int i = 0; i < c.length; i++) {
            if (max == b[i]) {
                ac.add(c[i]);
            }
        }
        if (ac.size() <= 1) {
            System.out.println(ac.get(0));
        }else {
            System.out.println("?");
        };
    }
}
