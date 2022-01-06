package programmers.level1_6;

//프로그래머스 레벨1 : 문자열 다루기 기본
public class Level_1_13 {
    public static void main(String[] args) {
        String s = "1234";
        solution(s);
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        if (!(len == 4 || len == 6)) {
            answer = false;
            return answer;
        }
        char[] a = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        loop:
        for (int j = 0; j < len; j++) {
            int cnt = 0;
            for (int i = 0; i < a.length; i++) {
                if (s.charAt(j) == a[i]) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                answer = false;
                break loop;
            }
        }
        return answer;
    }
}
