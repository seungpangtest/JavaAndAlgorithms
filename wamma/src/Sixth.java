import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int sum;

        System.out.println("첫번째 숫자: ");
        x = input.nextInt();

        System.out.println("두번째 숫자: ");
        y = input.nextInt();

        sum = x + y;

        System.out.println(sum);
    }
}
