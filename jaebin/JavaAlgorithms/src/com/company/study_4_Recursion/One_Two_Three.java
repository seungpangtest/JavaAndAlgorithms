package study_4_Recursion;

import java.util.Scanner;

public class One_Two_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int result = 0;
            result = ch(0, n);
            System.out.println(result);
        }

    }

     public static int ch(int sum, int goal) {
        if (sum > goal) return 0;
        if (sum == goal) return 1;
        int now = 0;
        for (int i = 1; i <= 3; i++) {
            now += ch(sum + i, goal);
            System.out.println(now);
        }
        return now;
    }
}