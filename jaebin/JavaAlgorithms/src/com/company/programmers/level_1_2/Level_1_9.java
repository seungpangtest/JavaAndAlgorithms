package programmers.level1_6;

//프로그래머스 레벨 1 : 2016년
public class Level_1_9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        String answer = "";
        String[] days = {"THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month_day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //1월 1일 금요일  1 금요일;
        int sum_day = 0;
        for (int i = 1; i < a; i++) {
            sum_day += month_day[i - 1];
        }
        sum_day += b;

        int c = (sum_day) % 7;
        answer = days[c];

        return answer;
    }
}
