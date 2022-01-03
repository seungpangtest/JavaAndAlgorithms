package programmers.level1_6;

//프로그래머스 레벨1 : 정수 제곱근 판별
public class Level_1_1 {
    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;
        double a = Math.sqrt(n);
        double b = Math.floor(a);

        if (a % b == 0) {
            answer = (long)Math.pow((a+1),2);
        } else {
            answer = -1;
        }
        return answer;
    }

}
