package study_assignment_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*백준 1978번 : 소수 찾기*/
public class Decimal_1_Success {
    public static void main(String[] args) {
        //소수란 ? 자연수 n 일때 , 약수로 1과 자기 자신만을 가지는 정수
        //핵심 : 그럼 2부터 n-1까지의 수로는 나눠져서는 안됨.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Integer b[] = new Integer[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < a; i++) {
            if (b[i] == 1) {
                result.add(b[i]);
            } else if (b[i] >= 4) {
                for (int j = 2; j <= b[i] - 1; j++) {
                    if (b[i] % j == 0) {
                        result.add(b[i]);
                    }
                }
            }
        }
        if (result == null) {
            System.out.println(0);
        } else {
            System.out.println(a - result.size());
        }
    }
}
