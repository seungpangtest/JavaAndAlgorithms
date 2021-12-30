package baekjoon.array;

import java.util.Scanner;

//백준 알고리즘 1546번 :  배열, 평균
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double m = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (m <= arr[i]) {
                m = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i] / m * 100;
        }
        System.out.println(sum/(double)n);
    }
}
