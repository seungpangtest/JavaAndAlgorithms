package study_2;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Integer result[] = new Integer[m];
        int answer = 0;
        loop:
        for (int i = 0; i < n; i++) {


            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    int sum = a[i] + a[j] + a[k];

                    if (sum == m) {
                        answer = sum;
                        break loop;
                    }else if(sum < m && answer < sum){
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
