package baekjoon.math_2;

import java.util.Scanner;

//백준 3009번: 수학 , 네번째 점
public class Math_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        int b[] = new int[4];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        if (a[0] == a[1]) {
            a[3] = a[2];
        } else if (a[0] == a[2]) {
            a[3] = a[1];
        } else if (a[1] == a[2]) {
            a[3] = a[0];
        }
        if (b[0] == b[1]) {
            b[3] = b[2];
        } else if (b[0] == b[2]) {
            b[3] = b[1];
        } else if (b[1] == b[2]) {
            b[3] = b[0];
        }

        System.out.println(a[3]+" "+b[3]);
    }
}
