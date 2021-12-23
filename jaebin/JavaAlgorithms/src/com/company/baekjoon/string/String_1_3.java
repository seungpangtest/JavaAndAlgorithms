package baekjoon.string;

import java.util.Scanner;
//백준 10809번 : 문자열 ,알파벳 찾기
public class String_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = new char[26];
        char a = 'a';
        for (int i = 0; i < c.length; i++) {
            c[i] = a;
            a++;
        }
        int b[] = new int[26];
        for (int i = 0; i < b.length; i++) {
            b[i] = -1;

        }

        for (int i = 0; i < c.length; i++) { // a b c d e f g h i j k l m n o p q r s t w y x z
            for (int j = 0; j < s.length(); j++) { // baekjoon
                if (s.charAt(j) == c[i]) {
                    b[i] = j;
                    break;
                }else continue;
            }
            System.out.print(b[i] + " ");
        }
    }
}
//1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
//1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1