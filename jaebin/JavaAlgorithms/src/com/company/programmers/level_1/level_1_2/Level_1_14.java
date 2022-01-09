package programmers.level1_6;

//프로그래머스 레벨1 : 두 정수 사이의 합
public class Level_1_14 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        solution(a, b);
        System.out.println(solution(a,b));
    }

    public static long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}
