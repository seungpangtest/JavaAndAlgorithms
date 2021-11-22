package practice;

public class Remainder_1 {

    public static void main(String[] args) {
        int n = 13;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        int x = 1;
        int cnt = 0;

        while (cnt == 0) {
            if (n % x == 1) {
                cnt = cnt + 1;
                answer = x;
            } else {
                x++;
            }
        }
        return answer;
    }
}
