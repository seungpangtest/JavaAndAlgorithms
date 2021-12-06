package study_1;

import java.util.Scanner;

public class
Bracket_1_Success {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String result = "";

        for (int i = 0; i < a; i++) {
            String s = sc.nextLine();
            int cnt = 0;
            int size = s.length();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(size - 1) == '(') {
                    cnt = cnt + 1;
                    break;
                } else if (s.charAt(0) == ')') {
                    cnt = cnt - 1;
                    break;
                } else if (s.charAt(j) == '(') {
                    cnt = cnt + 1;
                } else if (s.charAt(j) == ')') {
                    cnt = cnt - 1;
                    if(cnt<0){
                        break;
                    }
                }
            }
            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
