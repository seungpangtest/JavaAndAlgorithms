package SeungpangAlgorithmn.baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
// 657 3
//  1 5 7 -> 577
public class baekjoon_18511 {
    static int n,k;
    static int num[];
    static int ans; //예제 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 띄어쓰기 있는 데이터를 순서대로 받기
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        num = new int[k];

        for (int i = 0; i < k; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        answer(0);
        System.out.println(ans);

    }
    static void answer(int now){
        if (now > n) return;

        if (ans < now) ans = now;

        for (int i = k-1; i > -1; i--){
            answer(now * 10 + num[i]);
        }
    }
}
