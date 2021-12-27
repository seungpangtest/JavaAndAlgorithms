package baekjoon.math_1;

import java.util.Scanner;

//백준 2292 : 수학 벌집
public class Math_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 1;
        while (n > sum) {
            sum += 6*i;
            i++;
        }
        System.out.println(i);
    }
}
