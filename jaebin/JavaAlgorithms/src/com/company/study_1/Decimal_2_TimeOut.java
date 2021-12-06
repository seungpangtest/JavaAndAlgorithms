package study_1;

import java.util.Scanner;

/*백준 1929번 : 소수 구하기, 시간 초과 뜸.*/
public class Decimal_2_TimeOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int temp = 0;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a >= 2) {
            for (int i = a; i <= b; i++) {
                int cnt = 0;
                if(i == 2){
                    System.out.println(i);
                    continue;
                }
                for (int j = 2; j <= i - 1; j++) {
                    if (i % j == 0) {
                        cnt = cnt + 1;
                        break;
                    }
                }
                if (cnt < 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
