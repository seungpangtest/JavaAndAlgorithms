package com.company.baekjoon.sort;

import java.util.*;

//백준 1181번 : 배열, 단어 정렬
public class Sort_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hs.add(sc.nextLine());
        }
        String[] a = hs.toArray(new String[0]);
        Arrays.sort(a);
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() - o2.length()>0){
                    return 1;
                }else if (o1.length() - o2.length()<0){
                    return -1;
                }else {
                 return 0;
                }
            }
        });
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
