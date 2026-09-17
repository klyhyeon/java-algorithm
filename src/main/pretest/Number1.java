package pretest;

import java.util.Arrays;
import java.util.Comparator;

public class Number1 {
    public static int solution(int[][] intervals) {
        int answer = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int start = 0;
        int end = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                if (intervals[i][1] > end) {
                    end = intervals[i][1];
                }
            } else {
                start = intervals[i][0];
                end = intervals[i][1];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Number1.solution(new int[][]{{5,7}}));
    }
}
