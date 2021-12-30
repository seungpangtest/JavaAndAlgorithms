package baekjoon.string;

import java.io.IOException;
import java.util.Scanner;

//백준 2908번 : 문자열 ,상수
public class String_1_7 {
    public static void main(String[] args) throws IOException, NumberFormatException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String a = br.readLine();
//        String b = br.readLine();

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        StringBuffer sa = new StringBuffer(a);
        StringBuffer sb = new StringBuffer(b);

        sa.reverse();
        sb.reverse();

        int aa = Integer.parseInt(String.valueOf(sa));
        int bb = Integer.parseInt(String.valueOf(sb));

        if (aa > bb) {
            System.out.println(aa);
        } else {
            System.out.println(bb);
        }
    }
}
