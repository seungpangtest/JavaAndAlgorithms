package programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

//프로그래머스 : 정렬 , 가장 큰 수
public class Sort_2_solution {

    public static void main(String[] args) {

        int[] arr = {3, 30, 34, 5, 9};
        String result = solution(arr);
        System.out.println(result);
    }

    public static String solution(int[] numbers) {
        String answer = "";
        String[] answerStr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answerStr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(answerStr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        System.out.println(Arrays.toString(answerStr));
        if (answerStr[0].equals("0")) {
            answer += "0";
        } else {
            for (int i = 0; i < answerStr.length; i++) {
                answer += answerStr[i];
            }
        }
        return answer;
    }
}
