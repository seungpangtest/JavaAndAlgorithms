package baekjoon.math_2;

    import java.util.ArrayList;
    import java.util.Scanner;

    //백준 9020번 : 수학 , 골드바흐의 추측
    public class Math_2_7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                /* 먼저 n을 받는다.*/
                int n = sc.nextInt();

                int min = Integer.MAX_VALUE;
                // n의 제곱근의 버림을 int로 변환
                int nr = (int) Math.floor(Math.sqrt((double) n));
                ArrayList<Integer> arr = new ArrayList<>();
                int nArr[] = new int[n];
                for (int j = 1; j <= nArr.length; j++) {
                    nArr[j - 1] = j;
                }
                for (int k = 0; k < n - 1; k++) {
    //                System.out.println(nArr[k] + nArr[n-k-2]); // 17 , 26 , 35, 44
                    if (checkP(nArr[k]) == false && checkP(nArr[n - k - 2]) == false) {
                        int y = n - k - 2;
                        // 두 소수의 차
                        int sub = nArr[y] - nArr[k];

                        if (min > Math.abs(sub)) {
                            arr.add(0, nArr[k]);
                            arr.add(1, nArr[y]);
                            min = sub;
                        }
                    }
                }

                System.out.print(arr.get(0) + " " + arr.get(1));
                System.out.println();
            }
        }

        public static boolean checkP(int n) {
            if (n == 1) {
                return true;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return true;
                }
            }
            return false;
        }
    }
