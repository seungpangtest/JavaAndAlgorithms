package baekjoon.string;

import java.util.Scanner;

//백준 5622번 : 다이얼
public class String_1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int len = 26;
        char c[] = new char[len];
        char a = 'A';
        for (int i = 0; i < c.length; i++) {
            c[i] = a;
            a++;
        }
        int start = 0;
        String b[] = new String[10];
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 1) {
                continue;
            } else if (i == 7 || i == 9) {
                b[i] = new String(c, start, 4);
                start += 4;
            } else {
                b[i] = new String(c, start, 3);
                start += 3;
            }
        }
        int sum = s.length();
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0 || i == 1) {
                    continue;
                } else if (i == 7 || i == 9) {
                    for (int v = 0; v < 4; v++) {
                        char [] a1 = new char[4];
                        a1[v] = b[i].charAt(v);
                        if(s.charAt(j) == a1[v]){
                         sum += i;
                         break;
                        }
                    }
                } else {
                    for (int v = 0; v < 3; v++) {
                        char [] a1 = new char[3];
                        a1[v] = b[i].charAt(v);
                        if(s.charAt(j) == a1[v]){
                            sum += i;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
