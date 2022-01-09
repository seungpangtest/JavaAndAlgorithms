package programmers.level1_6;

//프로그래머스 레벨 1 : 콜라츠 추측
public class Level_1_7 {
    public static void main(String[] args) {
        int n = 626331;
        System.out.println(solution(n));
        solution(n);
    }

    public static int solution(int num) {
        int answer = 0;
        long num2 = (long)num;

        while (num2 != 1) {
            if (answer >= 500) {
                answer = -1;
                break;
            }
            if (num2 % 2 == 0) {
                num2 = num2 / 2;
                answer++;
                continue;
            } else if (num2 % 2 == 1) {
                num2 = num2 * 3 + 1;
                answer++;
                continue;
            }
        }
        return answer;
    }

}
