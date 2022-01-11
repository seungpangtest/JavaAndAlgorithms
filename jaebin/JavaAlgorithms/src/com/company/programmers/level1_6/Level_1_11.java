package programmers.level1_6;

//프로그래머스 레벨 1 : 소수찾기
public class Level_1_11 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }

    //소수판별 진짜 마지막 알고리즘
    public static int solution(int n) {
        int answer = 0;
        boolean check[] = new boolean[n + 1];
        check[0] = true;
        check[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {//2 //3 //4
            for (int j = i * i; j < check.length; j += i) {//4 6 8 10 .... //9 12 15 18 // 16
                if (check[j] == true) continue;
                check[j] = true;
            }
        }
        for (int i = 0; i < check.length; i++) {
            if (check[i] != true) {
                answer++;
            }
        }
        return answer;
    }
}
