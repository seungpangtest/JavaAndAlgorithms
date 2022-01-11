package programmers.level1_6;

//프로그래머스 레벨 1 : 핸드폰 번호 가리기
public class Level_1_4 {
    public static void main(String[] args) {
        String s = "027778888";
        System.out.println(solution(s));
    }

    public static String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();

        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                answer = phone_number.charAt(i) + answer;
                continue;
            }
            if (i == len - 2) {
                answer = phone_number.charAt(i) + answer;
                continue;
            }
            if (i == len - 3) {
                answer = phone_number.charAt(i) + answer;
                continue;
            }
            if (i == len - 4) {
                answer = phone_number.charAt(i) + answer;
                continue;
            }
            answer = '*' + answer;

        }

        return answer;
    }
}
