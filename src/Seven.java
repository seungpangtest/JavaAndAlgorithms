import java.util.Scanner;

public class Seven { //실적 목표를 초과한 금액의 10%를 보너스로 받는 성과금 계산
    public static void main(String[] args) {
        final int targetsales = 1000;
        int mySales, bonus;
        String result;

        Scanner input = new Scanner(System.in);

        System.out.println("실적을 입력하시오(단위: 만원): ");
        mySales = input.nextInt();

        if (mySales >= targetsales) {
            result = "실적 달성";
            bonus = (mySales - targetsales) / 10;
        }
        else {
            result = "실적 달성 못함";
            bonus = 0;
        }

        System.out.println(result + "\n" + "보너스: " + bonus);
    }
}
