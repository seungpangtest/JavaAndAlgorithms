package SeungpangAlgorithmn;

import java.util.Scanner;

public class Baekjoon_2798 {  //BlackJack
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] array = new int[N];
        int sum = 0;
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            array[i] += sc.nextInt();
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 1; j++) {
                for (int k = 0; k < N; k++) {
                    sum = array[i] + array[j] + array[k];

                    if (tmp < sum && sum <= M)
                        tmp = sum;
                }
            }

        }
        System.out.println(tmp);
    }
}