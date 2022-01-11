package baekjoon.math_2;

import java.util.Scanner;

//백준 4948번 : 수학 , 베르트랑 공준
public class Math_2_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int cnt = 0;
            int n = sc.nextInt();
            if (n == 0) break;
            boolean check[] = new boolean[2 * n + 1];

            check[0] = true;
            check[1] = true;
            for (int i = 2; i <= 2*n; i++) {
                if (i == 2) {
                    check[2] = false;
                    continue;
                }
                if (i == 3) {
                    check[2] = false;
                    continue;
                }
                if (i == 5) {
                    check[2] = false;
                    continue;
                }
                if (i == 7) {
                    check[2] = false;
                    continue;
                }
                if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    check[i] = true;
                }
                for (int j=2; i*j<=2*n; j++){
                    check[i*j] = true;
                }
            }
            for (int i = n+1; i <= 2 * n; i++) {
                if (check[i] == false) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
