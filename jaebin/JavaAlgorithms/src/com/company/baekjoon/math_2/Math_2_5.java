package baekjoon.math_2;

import java.util.Scanner;

//백준 4153번 : 수학, 직각삼각형
public class Math_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;

        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            int temp = 0;
            if (x > y) {
                if (x >= z) {
                    temp = z;
                    z = x;
                    x = temp;
                }
            } else {
                if (y >= z) {
                    temp = z;
                    z = y;
                    y = temp;
                }
            }

            if (x == 0 && y == 0 && z == 0){
                break;
            }
                if (z * z == x * x + y * y) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
        }
    }
}
