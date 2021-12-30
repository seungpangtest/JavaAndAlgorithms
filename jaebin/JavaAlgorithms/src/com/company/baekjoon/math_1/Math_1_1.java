package baekjoon.math_1;

import java.util.Scanner;

//백준 1712번 : 수학, 손익분기점
public class Math_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = 1;
        //a+bm = cm  => a = (c-b)m => a/(c-b) = m
        //존재하지 않은다 c-b가 음수가 된다. c-b < 0
        if (c <= b) {
            m = -1;
        } else {
            m = (a / (c - b)) + 1;

            // 손익분기점이 발생되는 때는 손익분기점이 같을 때보다 +1
            /*
             * 1070  170  1
             * 1140  340  2
             * 1210  510
             * 1280  680
             * 1350  850
             * 1420  1020
             * 1490  1190
             * 1560  1360
             * 1630  1530 9
             * 1700  1700 10
             * */
        }

        System.out.println(m);
    }

}
