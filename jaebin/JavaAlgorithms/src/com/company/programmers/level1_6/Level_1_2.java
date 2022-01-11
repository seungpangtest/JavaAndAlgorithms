package programmers.level1_6;

import java.util.ArrayList;
import java.util.Collections;

//프로그래머스 레벨1: 정수 내림차순으로 배치하기
public class Level_1_2 {
    public static void main(String[] args) {
        long n = 118372;
        solution(n);
    }

    public static long solution(long n) {
        long answer = 0;
        ArrayList<Long> arrayList = new ArrayList<>();

        while (n > 0) {
            int i = 0;
            arrayList.add(i, (n % 10));
            n = (n / 10);
            i++;
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        String s = "";
        for (int i = 0; i < arrayList.size(); i++) {
            s += arrayList.get(i);
        }
        answer = Long.parseLong(s);
        return answer;
    }
}
