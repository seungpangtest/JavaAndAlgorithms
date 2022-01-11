package programmers.level1_6;
//프로그래머스 레벨1 : 문자열 내 p와 y의 개수
public class Level_1_12 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
        solution(s);
    }

    public static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int len = s.length();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'p') {
                cnt++;
            } else if(s.charAt(i) == 'y'){
                cnt--;
            }else continue;
        }
        if (cnt == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
