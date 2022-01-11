package baekjoon.math_1;

import java.math.BigInteger;
import java.util.Scanner;

//백준 10757번: 수학, A+B
public class Math_1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
    }
}
