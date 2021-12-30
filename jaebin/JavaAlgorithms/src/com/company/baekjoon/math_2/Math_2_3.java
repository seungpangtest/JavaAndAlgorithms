package baekjoon.math_2;

import java.util.Scanner;

//백준 1085번 : 수학, 직사각형에서 탈충
public class Math_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min = Integer.MAX_VALUE;

        if (min > x) {
            min = x;
        }
        if (min > y) {
            min = y;
        }
        if (min > w - x) {
            min = w - x;
        }
        if (min > h - y) {
            min = h - y;
        }
        System.out.println(min);

    }
}
