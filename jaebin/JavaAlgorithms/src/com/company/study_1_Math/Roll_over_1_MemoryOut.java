package study_1_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 9093번,단어 뒤집기 : 스택을 사용하지 않고 reverse() 사용 */
public class Roll_over_1_MemoryOut {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        //메모리 초과해서 bufferdReader로 바꿔줌.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        String s[] = new String[n];
        String answer[] = new String[n];
        String answer2 = "";

        for (int j = 0; j < s.length; j++) {
            s[j] = bf.readLine();

            for (int i = 0; i < s[j].split(" ").length; i++) {
                String word = "";
                StringBuffer sb = new StringBuffer(s[j].split(" ")[i]);
                word = sb.reverse().toString();
                if (answer2.length() == 0) {
                    answer2 = answer2 + word;
                } else {
                    answer2 = answer2 + " " + word;
                }

            }
            answer[j] = answer2;
            answer2 = "";
            System.out.println(answer[j]);
        }
    }
}
