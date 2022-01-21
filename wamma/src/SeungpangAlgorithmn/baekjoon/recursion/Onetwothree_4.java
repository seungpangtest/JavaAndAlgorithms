package SeungpangAlgorithmn.baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Onetwothree_4 { //백트래킹을 이용한 구현
    private static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (int i =0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            count = 0;
//            backtracking(targetNumber, 0);
            System.out.println(count);
        }
    }

    public static void backtracking(int targetNumber, int sum){
        if (sum == targetNumber){
            count++;
        } else if(sum > targetNumber) {
            return;
        }
        for (int i = 1; i <=3; i++){
            backtracking(targetNumber, sum+i);
        }
}
    }

