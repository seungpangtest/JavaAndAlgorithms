package sw_expert_academy.D2;

import java.util.Scanner;
//sw expert academy : 백만장자 프로젝트
class Millionaire {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("#" + test_case + " " + checksum(a));
        }
    }

    public static long checksum(int[] a) {
        int len = a.length;
        int max = 0;
        long sum = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                max = a[i];
                continue;
            }
            if (max < a[i]) {
                max = a[i];
                continue;
            }
            if (max >= a[i]) {
                sum += max - a[i];
            }
        }
        //
        return sum;
    }
}