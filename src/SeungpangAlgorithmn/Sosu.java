package SeungpangAlgorithmn;

import java.util.Scanner;

public class Sosu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 받을 숫자 갯수
        int sosucnt = 0; // 소수 카운트
        int result = 0; // 소수 갯수

        for (int i = 0; i < n; i++){
            int m = sc.nextInt();
            sosucnt = 0;

            for (int j = 0; j < m; i++){
                if (m % j == 0)
                    sosucnt++;
            }
            if (sosucnt == 2) // 갯수가 2개면 소수이니
                result++; // 소수 갯수 +

        }
    }
}
