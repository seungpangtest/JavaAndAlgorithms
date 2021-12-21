package study_2_Brute_Force.practice_2;

public class Sol_2 {
    public static void main(String[] args) {
        int num = -1;

        System.out.println(solution(num));
    }

    public static String solution(int num) {
        String answer = "";

        num = Math.abs(num);

        if (num == 0) {
            answer = "Even";
        } else if (num % 2 == 1) {
            answer = "Odd";
        } else if (num % 2 == 0){
            answer = "Even";
        }
        return answer;
    }
}
