package baekjoon.function;

//백준 4673번 : 함수 , 셀프 넘버
public class Method_1_2 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 1; i < check.length; i++) {
            int n = d(i);
            if (n < 10001) {
                check[n] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    public static int d(int a) {
        if (a == 0) {
            return 0;
        }
        // a의 자리수 구하기
        // len 2
        int len = (int) (Math.log10(a) + 1);
        // sum 에 a 초기화
        int sum = a;
        for (int i = 1; i <= len; i++) {
            sum += (a % 10);
            a = a / 10;
        }
        return sum;
    }
}
