package SeungpangAlgorithmn.baekjoon.recursion;

import java.util.Scanner;

public class Whatisjaegyuei {
    static String underBar = "";
    static String sarr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

        sarr = new String[6];
        for (int i =0; i < sarr.length; i++)
            sarr[i] ="";
        sarr[0] = "\"재귀함수가 뭔가요?\"";
        sarr[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
        sarr[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        sarr[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
        sarr[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
        sarr[5] = "라고 답변하였지.";

        recur(N);
    }
    public static void recur(int num) {
        String temp = underBar;
        if(num == 0){
            System.out.println(temp+sarr[0]);
            System.out.println(temp+sarr[4]);
            System.out.println(temp+sarr[5]);
            return;
        }
        for (int i = 0; i < 4; i++) {//재귀호출하면서 반복되는 4개의 문장
            System.out.println(temp + sarr[i]);
        }
        underBar += "____";
        recur(num-1);

        System.out.println(temp+sarr[5]);


    }
}
