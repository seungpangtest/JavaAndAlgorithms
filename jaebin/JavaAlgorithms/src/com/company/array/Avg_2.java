package array;

import java.util.Scanner;

//백준 알고리즘 : 배열 , 평균은 넘겠지
public class Avg_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            double sum = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                sum += a[j];
            }
            double avg = (double) sum / (double) n;
            double pCnt = 0;
            int cnt = 0;
            for (int k = 0; k < n; k++) {
                if (a[k] > avg) {
                    cnt++;
                }
            }
            pCnt = (double) cnt / (double) n * 100.0;
            System.out.println(String.format("%.3f", pCnt)+"%");

        }
    }
}
