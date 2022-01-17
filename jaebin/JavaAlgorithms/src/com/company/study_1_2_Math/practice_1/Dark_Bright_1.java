package study_1_Math.practice_1;

public class Dark_Bright_1 {

    public static void main(String[] args) {
        int a[] = {1,2,3};
        boolean b[] = new boolean[a.length];
        b = new boolean[]{false,false,true};

        System.out.println(solution(a,b));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        // 문제 조건에 이미 있어서 안해도됨.
        if(absolutes.length == 0 || signs.length == 0){
            return answer;
        }
        for (int i=0; i<absolutes.length; i++){

            if(signs[i] == false){
                absolutes[i] = -absolutes[i];
            }
            answer += absolutes[i];
        }
        return answer;
    }
}
