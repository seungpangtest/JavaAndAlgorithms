package baekjoon.string;

import java.util.Scanner;

public class String_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int len = s.length();
        int a[] = new int[n];
        int sum = 0;
        for (int i=0; i<len; i++){
            a[i] =Character.getNumericValue(s.charAt(i));
            sum += a[i];
        }
        System.out.println(sum);
    }
}
