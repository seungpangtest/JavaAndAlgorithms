package baekjoon.array;

import java.util.Scanner;
//백준 8958번, OX 퀴즈
public class QuizOx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        int cnt[] = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 0;
            int temp = 0;
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == 'O') {
                    temp++;
                    max += temp;
                } else {
                    temp = 0;
                    max += temp;
                }
            }
            cnt[i] = max;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(cnt[i]);
        }
    }
}
