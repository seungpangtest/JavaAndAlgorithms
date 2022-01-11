package study_1_Math;

import java.util.Scanner;

/*백준 1929번 : 소수 구하기*/
public class Decimal_2_Success {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean[] t = new boolean[b + 1];
        t[0] = t[1] = true;
        for (int i = 2; i <= b; i++) {
            if (t[i] == true) {
                continue;
            }
            for (int j = i + i; j <= b; j = j + i) {
                t[j] = true;
            }
        }
        for (int i = a; i <= b; i++) {
            if (t[i] == false) {
                System.out.println(i);
            }
        }
    }
}
