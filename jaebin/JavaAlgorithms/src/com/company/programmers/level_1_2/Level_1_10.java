package programmers.level1_6;

//프로그래머스 레벨1 : 약수의 개수와 덧셈
public class Level_1_10 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        System.out.println(solution(left, right));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        int len = right - left + 1;
        int a[] = new int[len];

        int ai = 0;
        for (int i = left; i <= right; i++) {
            if (ai >= len) break;
            a[ai] = i;
            ai++;
        }


        for (int i = 0; i < a.length; i++) {
            int cnt = 0;
            for (int j = 0; j < a[i]; j++) {
                if (a[i] % (j + 1) == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += a[i];
            } else {
                answer -= a[i];
            }
        }
        return answer;
    }
}
