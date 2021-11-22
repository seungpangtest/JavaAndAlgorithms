package practice;

public class Dot_product_1 {

    public static void main(String[] args) {
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};

        System.out.println(solution(a,b));
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        if(a.length == 0){
            return answer;
        }
        for(int i = 0 ; i<a.length; i++){
            answer = answer + (a[i] * b[i]);
        }
        return answer;
    }
}
