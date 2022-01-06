package study_4_Recursion;

import java.util.Scanner;

// 백준 9095번 : 1,2,3 더하기 (점화식을 이용하여 풀기, 고정적인 1 2 3의 값에서 각 경우의 수의 규칙을 확인한 후 풀기)
public class One_Two_Three_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int nArr[] = new int[11];

        nArr[1] = 1;
        nArr[2] = 2;
        nArr[3] = 4;
        for (int i = 4; i < nArr.length; i++) {
            nArr[i] = nArr[i - 3] + nArr[i - 2] + nArr[i - 1];

        }
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(nArr[n]);
        }
    }
}
