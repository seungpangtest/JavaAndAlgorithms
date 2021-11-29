package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_1_Solution {

    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution(arr, com);
        System.out.println(result);
    }

    public static int[] solution(int[] array, int[][] commands) {
        //array [1,5,2,6,3,7,4] ,  commands [[2,5,3],[4,4,1],[1,7,3]]
        int[] answer = {};
        answer = new int[commands.length];
        int[] temp = array;
        System.out.println(Arrays.toString(temp));

        for (int i = 0; i < commands.length; i++) {
            //i= 0
//            for (int j = 0; j < commands[i].length; j++) {
//                // j=0,1,2
//            }
            array = Arrays.copyOfRange(temp, commands[i][0] - 1, commands[i][1]);
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));

            System.out.println(commands[i][2]);


            answer[i] = array[commands[i][2] - 1];
            System.out.println(answer[i]);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
