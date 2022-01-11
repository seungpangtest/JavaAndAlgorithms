package baekjoon.string;

import java.util.Scanner;

//백준 1152 : 문자열, 단어의 개수
public class String_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sa = s.split(" ");

        if (sa.length == 0) {
            System.out.println(0);
        } else if (sa[0] == "") {
            System.out.println(sa.length - 1);
        } else {
            System.out.println(sa.length);
        }
    }
}
