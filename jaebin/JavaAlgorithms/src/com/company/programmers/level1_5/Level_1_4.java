package programmers.level1_5;

//프로그래머스 레벨1 : 자릿수 더하기
public class Level_1_4 {
    public static void main(String[] args) {
        int n = 987;
        System.out.println(solution(n));
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;

        while (true) {
            if (n == 0) {
                break;
            }
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
