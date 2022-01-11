package baekjoon.math_1;

import java.util.Scanner;

//백준 10250번 : 수학 , ACM호텡
public class Math_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();// 층
            int w = sc.nextInt();// 방
            int n = sc.nextInt();// 몇번째 손님
            int y = 0;
            int x = 0;
            String bang = "";
            if ((n % h) == 0) {
                y = h * 100;
                x = n / h;
            } else {
                y = n % h * 100;
                x = (n / h) + 1;
            }
            System.out.println(x+y);
        }
    }
}
