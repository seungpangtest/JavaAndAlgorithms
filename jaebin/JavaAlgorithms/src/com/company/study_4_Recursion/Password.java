package study_4_Recursion;

import java.util.Arrays;
import java.util.Scanner;

//백준 1759번 : 암호만들기
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //암호의 길이 , 4
        int l = sc.nextInt();
        //총 주어진 단어 개수, 6
        int c = sc.nextInt();
        //
        String[] arr = new String[c];
        for (int i = 0; i < c; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        pass(l, arr, "", 0);

    }

    //최소 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음으로 구성을 위한 함수.
    public static boolean valid(String password) {
        int j = 0;
        int m = 0;
        for (char x : password.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                m++;
            } else {
                j++;
            }
        }
        //return이 boolean 함수에서 쓰는 방법
        return (j >= 2 && m >= 1);
    }

    //
    public static void pass(int l, String[] arr, String password, int i) {
        if (password.length() == l) {
            if (valid(password) == true) {
                System.out.println(password);
            }
            return;
        }
        if (i >= arr.length) return;
        pass(l, arr, password + arr[i], i + 1);
        pass(l, arr, password, i+1);
        return;
    }
}
