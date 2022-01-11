package baekjoon.math_1;

import java.util.Scanner;

//백준 2775번 :  수학, 부녀회장이 될테야
public class Math_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        //0층 1호 1명 , 0층 2호 2명
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt(); //층
            int n = sc.nextInt(); //호
            int sum[][] = new int[(k + 1)][n];

            for (int j = 0; j < k + 1; j++) {
                for (int l = 0; l < n; l++) {
                    if (l == 0) {
                        sum[j][l] = 1;
                    } else if (j == 0) {
                        sum[j][l] = l + 1;  //123
                    } else {
                        for (int o = 0; o <= l; o++) {
                            sum[j][l] += sum[j-1][o];
                        }
                    }
                }
            }
            System.out.println(sum[k][n-1]);
        }
    }
}
