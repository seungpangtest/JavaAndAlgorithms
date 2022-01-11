package baekjoon.math_2;

import java.util.ArrayList;
import java.util.Scanner;

//백준 11653번 : 수학, 소인수분해
public class Math_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 2;
        ArrayList<Integer> ax = new ArrayList<>();

        //72 36 18 9 3 1
        while (true) {
            if (n == 1) {
                break;
            }
            if (n % x == 0) {
                ax.add(x);
                n = n / x;
                continue;
            } else {
                x++;
                continue;
            }
        }
        for (Integer integer : ax) {
            System.out.println(integer);
        }
    }
}
