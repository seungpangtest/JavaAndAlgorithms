package study_1.practice_1;

public class Number_1 {
    public static void main(String[] args) {

        int n[] = {5,8,4,0,6,7,9};

        System.out.println(solution(n));
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        int sum = 0+1+2+3+4+5+6+7+8+9;

        if(numbers.length == 0){
            return answer;
        }
        for(int i = 0; i < numbers.length; i++){
        sum = sum - numbers[i];
        }
        answer = sum;
        return answer;
    }
}
