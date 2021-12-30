package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Bom {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//6
        int b = sc.nextInt();//7
        int c = sc.nextInt();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            StringTokenizer st = new StringTokenizer(br.readLine());
        String[] s = new String[a];
        char[][] cc = new char[a][b];

        for (int i = 0; i < a; i++) {
            s[i] = sc.nextLine();
            for (int j = 0; j < b; j++) {
                cc[i][j] = s[i].charAt(j);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(cc[i][j]);
            }
        }
    }
}
