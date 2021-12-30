package baekjoon.function;

import java.util.Scanner;

public class Method_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(d(n));
    }

    public static int d(int n) {
        int cnt = 0;
        if (n < 100) {
            return n;
        } else {
            cnt = 99;
            if (n == 100) {

                return cnt;
            }
            if (n == 1000) {
                n = 999;
            }

            for (int i = 100; i <= n; i++) {
                int h = i / 100;
                int t = (i / 10) % 10;
                int o = i % 10;

                if ((h - t) == (t - o)) {
                    cnt++;
                    continue;
                }
            }
        }

        return cnt;
    }

}
