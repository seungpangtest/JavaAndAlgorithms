package baekjoon.math_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 2869번 : 수학, 달팽이는 울고싶다.
    public class Math_1_4 {
        public static void main(String[] args) throws IOException {
//            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int day = (v - b) / (a - b);
            if ((v - b) % (a - b) != 0) {
                day++;
            }
            System.out.println(day);
        }
    }
