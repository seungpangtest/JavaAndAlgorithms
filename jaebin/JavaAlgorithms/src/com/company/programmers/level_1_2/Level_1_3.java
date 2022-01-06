package programmers.level1_6;

//프로그래머스 레벨1 : 자연수 뒤집어 배열로 만들기
public class Level_1_3 {
    public static void main(String[] args) {
        int n = 12345;
        int n2[] = solution(n);
        for (int i = 0; i < n2.length; i++) {
            System.out.println(n2[i]);
        }
        System.out.println();
    }

    public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
//
//        StringBuffer sb = new StringBuffer(s);
//        s = sb.reverse().toString();
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n = n / 10;
        }

        return answer;
    }
}
