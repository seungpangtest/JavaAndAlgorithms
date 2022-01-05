package programmers.level1_6;

import java.util.ArrayList;

//프로그래머스 레벨1 :  약수의 합
public class Level_1_6 {

    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }else continue;
        }
        for (int i = 0; i < arr.size(); i++) {
             answer += arr.get(i);
        }
        return answer;
    }
}
