package study_2;

import java.util.Scanner;
/*백준알고리즘 1018번 : 브루트 포스 체스판 다시칠하기*/
public class Chess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] s = new boolean[n][m];
        String[][] result1 = {{"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}};
        String[][] result2 = {
                {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}
                , {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}};

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                if(str.charAt(j) == 'W'){
                    s[i][j] = true;
                }else {
                    s[i][j] = false;
                }
            }
        }
        // 전체가 m * n 이기때문에 그 사이를 모두 검사하기 위함.
        int n_row = n-7;
        int m_col = m-7;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }
}
