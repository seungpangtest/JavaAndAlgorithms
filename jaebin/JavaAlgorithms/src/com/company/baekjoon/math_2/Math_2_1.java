package baekjoon.math_2;

import java.util.ArrayList;
import java.util.Scanner;

//백준 2581번 : 수학 , 소수
public class Math_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        ArrayList<Integer> al = new ArrayList<>();
        // 2 3 5 7

        boolean[] prime = new boolean[n + 1];    // 배열 생성
        get_prime(prime);

        for (int i = m; i <= n; i++) {
            if (prime[i] == false) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void get_prime(boolean[] prime) {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}
