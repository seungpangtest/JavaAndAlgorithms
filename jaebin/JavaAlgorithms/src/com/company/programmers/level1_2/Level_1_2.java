package programmers.level1_2;

public class Level_1_2 {
    public static void main(String[] args) {
        String s = "1S2D*3T";
        solution(s);
    }

    public static int solution(String dartResult) {
        int answer = 0;
        int result[] = new int[3];

        String tempString = "";
        int tempNum = 0;
        int idx = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char n = dartResult.charAt(i);

            if (n >= '0' && n <= '9') {
                tempString += String.valueOf(n);
            } else if (n == 'S' || n == 'D' || n == 'T') {
                tempNum = Integer.parseInt(tempString);
                if (n == 'S') {
                    tempNum = (int) Math.pow(tempNum, 1);
                } else if (n == 'D') {
                    tempNum = (int) Math.pow(tempNum, 2);
                } else {
                    tempNum = (int) Math.pow(tempNum, 3);
                }
                result[idx++] = tempNum;
                tempString = "";
            } else {
                if (n == '#') {
                    result[idx - 1] *= -1;
                } else if (n == '*') {
                    result[idx - 1] *= 2;
                    if (idx - 2 >= 0) {
                        result[idx - 2] *= 2;
                    }
                }
            }


        }
        for (int i = 0; i < result.length; i++) {
            answer += result[i];

        }
        return answer;
    }
}
