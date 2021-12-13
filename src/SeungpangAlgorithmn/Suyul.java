package SeungpangAlgorithmn;

import java.util.Scanner;

public class Suyul {
    static int[] array = new int[10];
    static boolean[] check = new boolean[10];
    StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Function(0, N, M);
    }

    public static void Function(int index, int N, int M) {
        if (index == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(array[i] + " ");
            }
            sb.append(index);
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (check[i]) continue; // true면 다음 숫자 실행
            check[i] = true;
            array[index] = i;
            Function(index + 1, N, M);
            check[i] = false;
        }
    }
}
