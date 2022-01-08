package com.company.programmers.Level_1_3;

import java.util.Arrays;

//프로그래머스 레벨 1 : 체육복 , 그리디 알고리즘: 매순간 최적이라고 생각되는 경우를 선택
public class Level_1_30 {
    public static void main(String[] args) {
        int n = 5;
        int[] b = {2, 4};
        int[] c = {1, 3, 5};
        solution(n, b, c);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        // 총 n명 -  체육복을 잃어버린 학생 lost.length 명
        int answer = n - lost.length;

        /*
        * 그리디 알고리즘 (탐욕법) : 매번 가장 좋아보이는 답을 선택하는 알고리즘*/

        //학생들의 번호는 체격 순
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 여벌의 체육복을 가져온 학생이 도난당한 경우를 먼저 생각 -> 최적의
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                }
            }
        }
        // 체육복을 도난 당한 학생의 앞이나 뒤에 여벌의 체육복을 가져온 학생에게 빌린다.
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])) {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
