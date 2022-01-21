package SeungpangAlgorithmn.baekjoon.recursion;

import java.util.Scanner;

public class Onetwothree_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
    }
    public static int go(int sum, int goal){
        if(sum > goal)
            return 0;
        if(sum == goal)
            return 1;
        int num = 0;
        for(int i = 1; i <=3; i++){
            num+= go(sum+i, goal);
        }
        return num;
    }
}
