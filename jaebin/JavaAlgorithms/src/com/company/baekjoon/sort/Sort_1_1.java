package baekjoon.sort;

    import java.util.*;

    //백준 2750번 :  정렬, 수정렬하기
    public class Sort_1_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                arrayList.add(n);
            }
            Collections.sort(arrayList);
            for (int i = 0; i < t; i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }
