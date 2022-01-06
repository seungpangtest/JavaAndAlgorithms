package com.company.programmers.level_1_1;

import java.util.HashMap;

//프로그래머스 레벨1 : kakao , 키패드 누르기
public class Level_1_10 {
    public static void main(String[] args) {
        int n[] = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String s = "left";
        System.out.println(solution(n, s));
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        //Map 으로 키패드와 위치좌표값을 key와 value로 받음.
        HashMap<String, String> hs = new HashMap<>();

        hs.put("1", "00");
        hs.put("2", "01");
        hs.put("3", "02");
        hs.put("4", "10");
        hs.put("5", "11");
        hs.put("6", "12");
        hs.put("7", "20");
        hs.put("8", "21");
        hs.put("9", "22");
        hs.put("*", "30");
        hs.put("0", "31");
        hs.put("#", "32");

        //왼손 엄지 손가락 첫 키패드
        String tL = "*";
        //오른손 엄지 손가락 첫 키패드
        String tR = "#";

        for (int i = 0; i < numbers.length; i++) {
            if (tL == String.valueOf(numbers[i])) {
                answer += "L";
                continue;
            }
            if (tR == String.valueOf(numbers[i])) {
                answer += "R";
                continue;
            }
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                tL = String.valueOf(numbers[i]);
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                tR = String.valueOf(numbers[i]);
            } else if (numbers[i] == 0 || numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8) {
                String Lxy = hs.get(tL);
                String Rxy = hs.get(tR);
                String n = hs.get(String.valueOf(numbers[i]));

                int l[] = bu(Lxy);
                int r[] = bu(Rxy);
                int nArr[] = bu(n);

                //현재 왼손 엄지 손가락위치와 다음 눌러야 할 키패드 거리
                int lv = (Math.abs(nArr[0] - l[0]) + Math.abs(nArr[1] - l[1]));
                //현재 오른손 엄지 손가락위치와 다음 눌러야 할 키패드 거리
                int rv = (Math.abs(nArr[0] - r[0]) + Math.abs(nArr[1] - r[1]));
                //                LRLLLRLLRRL
                if (lv > rv) {
                    answer += "R";
                    tR = String.valueOf(numbers[i]);
                } else if (rv > lv) {
                    answer += "L";
                    tL = String.valueOf(numbers[i]);
                } else if (rv == lv) {
                    if (hand.equals("right")) {
                        answer += "R";
                        tR = String.valueOf(numbers[i]);
                    } else if (hand.equals("left")) {
                        answer += "L";
                        tL = String.valueOf(numbers[i]);
                    }
                }
            } else {
                continue;
            }
        }
        return answer;
    }

    public static int[] bu(String s) {
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = Character.getNumericValue(s.charAt(i));
        }
        return a;
    }

}
