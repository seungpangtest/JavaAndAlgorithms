package study_4_Recursion.practice;

import java.util.Scanner;

//백준 2447번 : 재귀 , 별찍기-10
public class StarRecursion {
    public static char arr[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n은 3의 거듭제곱
        int n = sc.nextInt();
        arr = new char[n][n];

        star(0, 0, n, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void star(int x, int y, int n, boolean b) {
        if (b) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }
        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i = i + size) {
            for (int j = y; j < y + n; j = j + size) {
                count++;
                if (count == 5) {// 공백칸 ' '
                    star(i, j, size, true);
                } else {// 별찍기 '*'
                    star(i, j, size, false);
                }
            }
        }
    }
}
