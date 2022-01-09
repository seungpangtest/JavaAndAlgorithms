package com.company.programmers.level_1.level_1_1;

//프로그래머스 레벨1 : 소수 만들기
public class Level_1_7 {
    public static void main(String[] args) {
        int[] n = {1,2,7,6,4};
        solution(n);
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int nums_len = nums.length;
//        int count = nums_len * (nums_len - 1) * (nums_len - 2) / 3 * 2 * 1;
        int sum = 0;// 6 7 8 9


        for (int i = 0; i < nums_len; i++) {
            for (int j = i + 1; j < nums_len; j++) {
                for (int k = j + 1; k < nums_len; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (sosu(sum)) {
                        answer++;
                    }
                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }

    public static boolean sosu(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }else continue;
        }
        return true;
    }
}
