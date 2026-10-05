package programmers.dp;

import java.util.Arrays;

/**
 * 1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.
 * 표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. (단, 정사각형이란 축에 평행한 정사각형을 말합니다.)
 */

public class LargestTriangle {

    public int solution(int[][] board) {
        int answer = 0;
        // board[i][j]를 오른쪽 아래 꼭짓점으로 하는 가장 큰 정사각형의 한 변 길이는? = dp[i][j]
        // dp[i][j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) + 1
        int[][] dp = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = board[i][j];
                } else {
                    if (board[i][j] == 0) {
                        dp[i][j] = 0;
                        continue;
                    }
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                }
            }
        }
        for (int[] d : dp) {
            answer = Math.max(answer, Arrays.stream(d).max().orElse(-1));
        }
        return answer * answer;
    }
}
