package hash;

import java.util.Arrays;
import java.util.HashMap;

public class Hash_1_2_Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        HashMap<String,Integer> hash = new HashMap<>();

        for (String player : participant){
            hash.put(player , hash.getOrDefault(player,0)+1);
        }

        for (String player : completion){
            hash.put(player , hash.get(player)-1);
        }

        for (String key : hash.keySet()){
            if(hash.get(key)!=0){
                answer = key;
            }
        }
        return answer;
    }
}
