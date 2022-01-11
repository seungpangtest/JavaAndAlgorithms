package SeungpangAlgorithmn.baekjoon.recursion;

import java.util.Scanner;

public class Onetwothreeplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int num[] = new int[11];

        num[1] = 1;
        num[2] = 2;
        num[3] = 4;

        for (int i = 0; i < T; i++){
            int n = sc.nextInt();
            for(int j = 4; j <=n; j++){
                num[j] = num[j-1] + num[j-2]+num[j-3];
            }
            System.out.println(num[n]);
        }

    }
}
