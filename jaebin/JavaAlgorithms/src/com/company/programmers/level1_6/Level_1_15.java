package programmers.level1_6;

//프로그래머스 레벨 1 : 문자열을 정수로 바꾸기
public class Level_1_15 {
    public static void main(String[] args) {
        String s = "1234";
        solution("1234");
        System.out.println(solution("-1234"));
    }

    public static int solution(String s) {
        int answer = 0;

        String c = "";

        s.substring(0, 1);
        answer = Integer.parseInt(s);

        if (c.equals('-')) {
            answer = -answer;
        }
        return answer;
    }
}
