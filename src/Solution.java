public class Solution {
    public static void main(String[] args) {
        String s = "try hello world";
        solution(s);
    }
    public static String solution(String s) {
        String answer = "";
        int index = 0;
        // try hello world
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i) == ' '){
                index = 0;
                answer += ' ';
                continue;
            }
            if(index % 2 == 0){
                answer += s.toUpperCase().charAt(i);
                index++;
            }else{
                answer += s.toLowerCase().charAt(i);
                index++;
            }
        }
        return answer;
    }
}

