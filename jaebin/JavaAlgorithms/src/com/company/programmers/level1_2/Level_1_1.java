package programmers.level1_2;

//프로그래머스 레벨1 :  문자열 비교 개수 구하기
public class Level_1_1 {
    public static void main(String[] args) {
        String s = "Pyy";
        solution(s);
    }

    static boolean solution(String s) {
        boolean answer = true;
        int cntP = 0;
        int cntY = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'y') {
                cntY++;
            } else if (s.charAt(i) == 'p') {
                cntP++;
            } else {
                continue;
            }
        }
        if (cntY == cntP) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}



