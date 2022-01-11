package programmers.level1_6;

//프로그래머스 레벨 1 : 하샤드 수
public class Level_1_8 {
    public static void main(String[] args) {
        int arr = 13;
        System.out.println(solution(arr));
        solution(arr);
    }

    public static boolean solution(int x) {
        boolean answer = true;
        int len = String.valueOf(x).length();
        int[] a = new int[len];
        int temp = x;

        for (int i = 0; i < len; i++) {
            a[i] = x % 10;
            x = x / 10;
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += a[i];
        }

        if (temp % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
