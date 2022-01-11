package study_2_Brute_Force.practice_2;

public class Sol_3 {
    public static void main(String[] args) {
        String s = "try hello world";
        solution(s);
    }

    public static String solution(String s) {
        String answer = "";
        int temp = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                temp = 0;
                answer = answer + ' ';
                continue;
            }
            if (temp % 2 == 0) {
                answer = answer + s.toUpperCase().charAt(i);
            } else if (temp % 2 == 1) {
                answer = answer + s.toLowerCase().charAt(i);
            }
            temp++;
        }
        System.out.println(answer);
        return answer;
    }
}
