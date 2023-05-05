package programmers.sorting;

import java.util.Arrays;

public class KNumber {

    public int[] solution(int[] array, int[][] commands) {
        //12:16 ~ 12:31 (15min)
        //i부터 j까지 자르고 정렬했을 때 k번째 숫자를 구하자
        int[] answer = new int[commands.length];

        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            int[] temp = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(temp);
            answer[a] = temp[k - 1];
        }
        return answer;
    }
}
