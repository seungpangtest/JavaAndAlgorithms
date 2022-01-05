package programmers.level1_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//프로그래머스 레벨1 : 나누어 떨어지는 숫자배열
public class Level_1_20 {
    public static void main(String[] args) {
        int[] a = {3,2,6    };
        int divisor = 10;
        solution(a, divisor);
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        if (answer.length == 0) {
            answer=new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}
