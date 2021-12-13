package programmers.level1_1;

// 프로그래머스 레벨 1 내적구하기
public class Level_1_2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        solution(a, b);
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }

        return answer;
    }
}
