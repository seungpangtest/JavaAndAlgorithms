package programmers.level1_6;

import java.util.ArrayList;

//프로그래머스 레벨1 : 완전탐색
public class Level_1_5 {
    public static void main(String[] args) {
        int n[] = {1,3,2,4,2};
        solution(n);
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int c[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int arr[] = new int[3];

        int length = answers.length;

        for (int i = 0; i < length; i++) {
            if (answers[i] == a[i % 5]) {
                arr[0] += 1;
            }
            if (answers[i] == b[i % 8]) {
                arr[1] += 1;
            }
            if (answers[i] == c[i % 10]) {
                arr[2] += 1;
            }
        }
        int max = arr[0];
        ArrayList<Integer> maxIndex = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        for (int i=0; i<arr.length; i++){
            if (max <= arr[i]) {
                maxIndex.add(i+1);
            }
        }
        answer = new int[maxIndex.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = maxIndex.get(i);
        }
        return answer;
    }
}
