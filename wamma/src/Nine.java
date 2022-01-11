import java.util.Scanner;

public class Nine { //swich 문을 이용한 각월의 날수 알기
    public static void main(String[] args) {
        int month;
        int days = 0;

        System.out.println("일수를 알고 싶은 달을 입력하시오: ");
        Scanner scanner = new Scanner(System.in);

        month = scanner.nextInt();
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println("월의 날수는" + days);
    }
}
