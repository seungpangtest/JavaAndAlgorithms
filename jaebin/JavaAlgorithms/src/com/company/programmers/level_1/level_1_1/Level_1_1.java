package programmers.level1_1;

//프로그래머스 레벨 1 평균구하기
public class Level_1_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        solution(arr);
    }

    public static double solution(int[] arr) {
        double answer = 0;
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = (double)sum / (double)arr.length;
        return answer;
    }
}

