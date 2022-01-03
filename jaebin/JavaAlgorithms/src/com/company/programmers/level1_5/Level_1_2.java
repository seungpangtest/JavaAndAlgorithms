package programmers.level1_5;
//프로그래머스 레벨1 : 행렬의 덧셈
public class Level_1_2 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        solution(arr1, arr2);

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int len = arr1.length;
        int len2 = arr1[0].length;
        int[][] answer = new int[len][len2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        return answer;
    }
}
