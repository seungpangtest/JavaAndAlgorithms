package baekjoon.string;

import java.util.Scanner;

//백준 1316번 : 문자열, 그룹체커
public class String_1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int result = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (check(s) == true) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean check(String s) {
        int len = s.length();
        boolean b[] = new boolean[26];
        int prev = 0;

        for (int i = 0; i < len; i++) {

            int now = s.charAt(i);

            // 앞선 문자가 i번째 문자가 같지 않다면??
            if (prev != now) {
                // 해당 문자가 false(처음 나왔다)면 ??
                if (b[now - 'a'] == false) {
                    b[now - 'a'] = true;
                    prev = now;
                } else { // 처음나온게 아니라면 그룹단어 false
                    return false;
                }
            } else { //앞선 문자와 i번째 문자와 같다면 그대로 continue
                continue;
            }
        }
        // 다 검사해서 한번 나온 문자가 다시한번더 나오지 않는다면 그룹단어 true
        return true;
    }
}
