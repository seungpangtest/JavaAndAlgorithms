package assignment_1;

import java.util.Scanner;

public class Common_factor_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = 24; // 1 ,2,3,4,6,8,12,24
        b = 18; // 1,2,3,6,9,18

        int r = 1;

        int r1 ;
        int r2 ;
        int r3 ;

        //최대공약수
        int max;
        //최소공배수
        int min;

        r1 = a % b; // 6
        r2 = b % r1;  // 0
        r3 = r1 % r2; // 0

        while ( r == 0 ){

        }

        min = a * b ;


        System.out.println();

    }
}
