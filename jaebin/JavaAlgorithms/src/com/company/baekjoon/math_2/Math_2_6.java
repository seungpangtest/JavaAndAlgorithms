package baekjoon.math_2;

import java.util.Scanner;

//백준 4948번 : 수학, 베르트랑 공준
public class Math_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int cnt = 0;
            int n = sc.nextInt();
            if (n == 0) break;
            boolean check[] = new boolean[2 * n + 1];
            for (int i = n + 1; i <= 2 * n; i++) {
                check[i] = checkP(i);
            }
            for (int i = n + 1; i <= 2 * n; i++) {
                if (check[i] == false) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    public static boolean checkP(int n) {
        if (n == 1) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
