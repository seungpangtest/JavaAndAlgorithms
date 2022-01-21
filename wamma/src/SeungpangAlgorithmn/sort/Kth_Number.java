package SeungpangAlgorithmn.sort;

import java.util.Arrays;

public class Kth_Number {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] comman = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution(arr, comman);
        System.out.println(result);
    }


    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i< commands.length; i++){
            int a,b,c;
            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];
            int[] temp = Arrays.copyOfRange(array,a-1,b); //Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스)

            Arrays.sort(temp);
            answer[i] = temp[c-1];
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
