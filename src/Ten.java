import java.util.Scanner;

public class Ten { // 최대 공약수 찾기

    public static void main(String[] args) {
        int x, y, z;
        System.out.println("두개의 정수를 입력하시오(큰수, 작은수): ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        while (y != 0){
            z = x % y;
            x = y;
            y = z;
        }
        System.out.println("최대 공약수는 " + x);
    }
}
