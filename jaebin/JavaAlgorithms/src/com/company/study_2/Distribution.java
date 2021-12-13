package study_2;

import java.util.Scanner;

/*백준 알고리즘: 2231번 분해합 : 브루트 포스*/
public class Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //분배합
        int a = sc.nextInt();
        //생성자
        int result = 0;

        //int 형 숫자의 자리수 구하기
        //(int)(Math.log10(a)+1)
        int size = (int) (Math.log10(a) + 1);

        // 10 10 100  ...
        // a = b + (b /100) + (b/10) +(b%10)
        for (int i = 0; i < a; i++) {
            int temp = i;
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum = sum + temp % 10;
                temp = temp /10;
            }
            if(a == i + sum){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
