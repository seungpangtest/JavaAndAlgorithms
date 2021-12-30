package baekjoon.string;

import java.util.Scanner;

//백준 2941번 : 문자열, 크로아티아 알파벳
public class String_1_9 {
    public static void main(String[] args) {

        int result = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//ljes=njak
        StringBuffer sb = new StringBuffer(s);

        int len = s.length(); // 9
        for (int i = 0; i < len; i++) {
            if (sb.charAt(i) == 'c') {
                if (i + 1 < len) {
                    if (sb.charAt(i + 1) == '=' || sb.charAt(i + 1) == '-') {
                        result++;
                        i += 1;
                        continue;
                    } else {
                        result++;
                        continue;
                    }
                } else {
                    result++;
                    continue;
                }

            } else if (sb.charAt(i) == 'd') {
                if (i + 1 < len) {
                    if (sb.charAt(i + 1) == '-') {
                        result++;
                        i += 1;
                        continue;
                    } else if (sb.charAt(i + 1) == 'z') {
                        if (i + 2 < len) {
                            if (sb.charAt(i + 2) == '=') {
                                result++;
                                i += 2;
                                continue;
                            } else {
                                result++;
                                continue;
                            }
                        } else {
                            result++;
                            continue;
                        }

                    } else {
                        result++;
                        continue;
                    }
                } else {
                    result++;
                    continue;
                }
            } else if (sb.charAt(i) == 'l') {
                if (i + 1 < len) {
                    if (sb.charAt(i + 1) == 'j') {
                        result++;
                        i += 1;
                        continue;
                    } else {
                        result++;
                        continue;
                    }
                } else {
                    result++;
                    continue;
                }
            } else if (sb.charAt(i) == 'n') {
                if (i + 1 < len) {
                    if (sb.charAt(i + 1) == 'j') {
                        result++;
                        i += 1;
                        continue;
                    } else {
                        result++;
                        continue;
                    }
                } else {
                    result++;
                    continue;
                }
            } else if (sb.charAt(i) == 's') {
                if (i + 1 < len) {
                    if (sb.charAt(i + 1) == '=') {
                        result++;
                        i += 1;
                        continue;
                    } else {
                        result++;
                        continue;
                    }
                } else {
                    result++;
                    continue;
                }
            } else if (sb.charAt(i) == 'z') {
                if (i + 1 < len) {
                    if (sb.charAt(i + 1) == '=') {
                        result++;
                        i += 1;
                        continue;
                    } else {
                        result++;
                        continue;
                    }
                } else {
                    result++;
                    continue;
                }
            } else if (sb.charAt(i) == '=') {
                continue;
            } else if (sb.charAt(i) == '-') {
                continue;
            } else {
                result++;
                continue;
            }
        }
        System.out.println(result);

    }
}
