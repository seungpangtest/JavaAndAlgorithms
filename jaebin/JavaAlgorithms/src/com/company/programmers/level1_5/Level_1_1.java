package programmers.level1_5;

import java.util.ArrayList;

//프로그래머스 레벨1 : kakao , 크레인 인형뽑기 게임
public class Level_1_1 {
    public static void main(String[] args) {
        int[][] a = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] b = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(a, b));
    }

    static int cnt = 0;

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        //인형뽑기 상자의 크기, 마지막 index 번호 len-1
        int len = board.length;
        int size = moves.length;

        int[][] b = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                b[i][j] = board[j][i];
            }
        }
//        //모든 0을 뒤로보내기
//        for (int i = 0; i < board.length; i++) {
//            board[i] = moveZ(board[i]);
//        }
        for (int i = 0; i < size; i++) {
            //1(i)회차 선택
            int select = moves[i];
            for (int j = 0; j <= len-1; j++) {
                //board[0]
                if (b[select - 1][j] == 0) {
                    continue;
                } else if (b[select - 1][j] != 0) {
                    if (select-1<0){

                    }
                    if (arr.size() == 0) {
                        arr.add(b[select - 1][j]);
                        b[select - 1][j] = 0;
                        break;
                    } else if (arr.size() > 0) {
                        // arr.size() 가 0보다 크면 전 인덱스와 board[select-1][j] 확인.
                        arr.add(b[select - 1][j]);
                        arr = delOrAdd(arr);
                        b[select - 1][j] = 0;
                        break;
                    }
                }

            }
        }

        answer = cnt;
        return answer;
    }

    //모든 0을 뒤로보내는 함수
    public static int[] moveZ(int[] a) {
        int[] n = new int[a.length];
        int indexZero = -1;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                indexZero = a[i];
                n[cnt] = indexZero;
                cnt++;
                continue;
            }
        }
        for (int i = cnt; i < n.length; i++) {
            n[i] = 0;
        }
        return n;
    }

    //전 인덱스에 같은 숫자가 있으면 둘다 삭제
    public static ArrayList<Integer> delOrAdd(ArrayList<Integer> arr) {
        ArrayList<Integer> result = arr;
        int len = arr.size();
        if (arr.get(len - 1) == arr.get(len - 2)) {
            arr.remove(len - 1);
            arr.remove(len - 2);
            cnt = cnt + 2;
            result = arr;
            return result;
        }
        result = arr;
        return result;
    }
}
