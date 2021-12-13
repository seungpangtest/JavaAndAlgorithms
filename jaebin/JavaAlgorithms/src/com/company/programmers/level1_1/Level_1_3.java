package programmers.level1_1;

import java.util.ArrayList;
import java.util.Collections;

//프로그래머스 레벨 1 실패율
public class Level_1_3 {
    public static void main(String[] args) {
        int N = 4;
        int[] stages = {4,4,4,4,4};
        solution(N, stages);
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<Double> listFail = new ArrayList<>();
        double[] fail = new double[N];
        double n = stages.length;
        for (int i = 0; i < fail.length; i++) {
            double cnt = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    cnt++;
                    continue;
                }
            }
            if(cnt == 0){
                fail[i] = 0.0;
                listFail.add(fail[i]);
                continue;
            }
            fail[i] = cnt / n;
            listFail.add(fail[i]);
            n -= cnt;
        }
        Collections.sort(listFail, Collections.reverseOrder());
        for (int i = 0; i < listFail.size(); i++) {
            for (int j = 0; j < fail.length; j++) {
                if (listFail.get(i) == fail[j]) {
                    answer[i] = j + 1;
                    fail[j] = -1.0;
                    break;
                }
            }
        }
        for (int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }
}
