package programmers.level1_6;

//프로그래머스 레벨1 :  최소직사각형
public class Level_1_25 {
    public static void main(String[] args) {
        int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(a);
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        for (int i = 0; i < sizes.length; i++) {
            int temp = 0;
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int max[] = new int[2];
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0]>max[0]){
                max[0] = sizes[i][0];
            }
            if (sizes[i][1]>max[1]){
                max[1] =sizes[i][1];
            }
        }
        answer = max[0]*max[1];
        return answer;
    }
}
