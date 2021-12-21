package baekjoon.function;

// 백준 15596번 : 함수
public class Method_1_1 {

    public static void main(String[] args) {
        int n[] ={1,2,3,4,5,6};
        sum(n);
        System.out.println(sum(n));
    }
    public static long sum(int[] a){
        long sum =0;
        for(int i = 0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
