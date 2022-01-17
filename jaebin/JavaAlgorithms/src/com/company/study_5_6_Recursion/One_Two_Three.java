package study_4_Recursion;

import java.util.Scanner;

// 백준 9095번 : 1,2,3 더하기 (재귀를 이용하여 풀기)
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
    // 그리고 모든 재귀는 for문으로 나타낼수있습니다.
     public static int ch(int sum, int goal) {
        //끝나는 조건
        if (sum > goal) return 0;
         //끝나는 조건
        if (sum == goal) return 1;
        //결과 now
        int now = 0;
        // 재귀 로직
        for (int i = 1; i <= 3; i++) {
            now += ch(sum + i, goal);
//            System.out.println(now);
        }
        return now;
    }
}
