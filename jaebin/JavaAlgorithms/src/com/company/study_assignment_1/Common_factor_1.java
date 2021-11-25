package study_assignment_1;

import java.util.Scanner;

/*최대공약수와 최소공배수*/
public class Common_factor_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tempA = a;
        int tempB = b;
        int r = 1;
        //최대공약수
        int max = 0;
        //최소공배수
        int min = 0;
        while (r != 0) {
            r = tempA % tempB;
            tempA = tempB;
            if(r == 0)break;
            tempB = r;
        }
        max = tempB;
        min = a * b / max;
        System.out.println(max);
        System.out.println(min);
    }
}
