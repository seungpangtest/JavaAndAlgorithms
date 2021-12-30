package study_3_MtoN;

import java.util.Scanner;

public class NtoM_1 {
    static int[] a = new int[10];
    static boolean[] c = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        go(0, n, m);
    }

    public static void go(int index, int n, int m) {
        if (index == m) {
            for (int i = 0; i < n; i++) {
                if(a[i] == 0){
                    continue;
                }
                System.out.print(a[i]+" ");
            }
            System.out.println();
        } else if (index != m) {

            for (int i = 1; i <= n; i++) {

                if (c[i] == true) {
                    continue;
                }
                c[i] = true;
                a[index] = i;
                go(index + 1, n, m);
                c[i] = false;
            }

            return;
        }
    }
}
