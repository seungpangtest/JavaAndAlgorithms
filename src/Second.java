import java.util.Scanner;

public class Second {  //원의 면적 구하기
    public static void main(String[] args) {
        double r;
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.println("반지름을 입력하시오: ");
        r = input.nextDouble();
        radius = 3.14 * r * r;

        System.out.println(radius);
    }
}
