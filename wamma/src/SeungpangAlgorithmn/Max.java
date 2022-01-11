package SeungpangAlgorithmn;

import java.util.Scanner;

public class Max { // 유클리드 호제법을 이용한 최대공약수, 최소공배수
    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1 ;
        else return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = gcd(num1, num2);

        System.out.println(gcd);
        System.out.println(num1 * num2 / gcd);
    }
}
