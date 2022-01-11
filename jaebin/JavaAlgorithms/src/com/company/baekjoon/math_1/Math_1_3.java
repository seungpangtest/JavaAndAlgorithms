package baekjoon.math_1;

import java.util.Scanner;

//백준 1193 : 수학 분수 찾기
public class Math_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1; // 분모와 분자값의 합
        // T % 2 가 0 일 때는 대각선 위 방향, 1 일 때는 아래 방향으로 진행
        int pv = 0;

        while (true) {
            if (n <= pv + t) {
                if (t % 2 == 1) {
                    //분모가 큰수 부터 내려감.
                    System.out.println((t - (n - pv - 1)) + "/" + (n - pv));
                    break;
                } else {
                    System.out.println((n - pv) + "/" + (t - (n - pv - 1)));
                    break;
                }

            } else {
                pv += t;
                t++;
            }
        }
    }
}
