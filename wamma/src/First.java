import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        String name;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.println("이름을 입력하시오: ");
        name = input.nextLine();

        System.out.println("나이를 입력하시오: ");
        age = input.nextInt();

        System.out.println(name + "님 안녕하세요!" + (age) + "살이시네요");

    }
}
