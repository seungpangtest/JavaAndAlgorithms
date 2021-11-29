package study_assignment_2;

import java.util.Scanner;

/*백준 7568번 : 덩치*/
public class Bulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        //등수
        int[] result = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];


        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }
                if (x[i] < x[j] && y[i] < y[j]) {
                    cnt++;
                }
            }
            result[i] = cnt;
            System.out.println(result[i]);
        }
    }
}
