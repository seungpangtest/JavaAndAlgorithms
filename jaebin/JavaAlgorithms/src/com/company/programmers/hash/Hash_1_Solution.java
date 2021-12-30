package programmers.hash;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
//프로그래머스 해시 , 완주하지 못한 선수
public class Hash_1_Solution {

    static String[] participant = { "mislav", "stanko", "mislav", "ana" };
    static String[] completion = { "stanko", "ana", "mislav" };

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(solution(participant, completion));
        bw.flush();
        bw.close();
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++){
            if(completion[i].equals(participant[i])){
                continue;
            }else if(!completion[i].equals(participant[i])){
                answer += participant[i];
                return answer;
            }
        }
        answer += participant[participant.length-1];
        return answer;
    }

}
