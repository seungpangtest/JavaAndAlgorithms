import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        double w;
        double h;
        double area;
        double perimeter;

        Scanner input = new Scanner(System.in);

        System.out.println("사각형의 가로를 입력하시오");
        w = input.nextInt();
        System.out.println("사각형의 세로를 입력하시오");
        h = input.nextInt();
        area = w * h;
        perimeter = 2 *(w + h);

        System.out.println("사각형의 넓이는" + area);
        System.out.println("사각형의 둘레는" + perimeter);
    }
}
