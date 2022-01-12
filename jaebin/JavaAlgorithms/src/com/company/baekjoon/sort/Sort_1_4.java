package com.company.baekjoon.sort;

import java.io.*;
import java.util.*;

//백준 10814번 : 나이순 정렬
public class Sort_1_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(br.readLine());
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                if (Integer.parseInt(o1.split(" ")[0])==Integer.parseInt(o2.split(" ")[0])){
//                    return String.valueOf(arr.indexOf(o1)).compareTo(String.valueOf(arr.indexOf(o2)));
//                }
                return Integer.parseInt(o1.split(" ")[0])-Integer.parseInt(o2.split(" ")[0]);

            }
        });
        for (int i = 0; i < arr.size(); i++) {
            bw.write( arr.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
