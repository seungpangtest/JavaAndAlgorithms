package study_2_Brute_Force.practice_2;

public class Sol_1 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        solution(x, n);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x * (i + 1);
            System.out.println(answer[i]);
        }
        return answer;
    }
}
