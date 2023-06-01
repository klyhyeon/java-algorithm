package programmers.exhaustive_search;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private int[] looserA = new int[]{1, 2, 3, 4, 5};
    private int[] looserB = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    private int[] looserC = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public List<Integer> solution(int[] answers) {
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;

        for (int i = 0; i < answers.length; i++) {
            int currAnswer = answers[i];
            if (currAnswer == looserA[i % 5]) {
                scoreA++;
            }
            if (currAnswer == looserB[i % 8]) {
                scoreB++;
            }
            if (currAnswer == looserC[i % 10]) {
                scoreC++;
            }
        }
        int[] scores = new int[]{scoreA, scoreB, scoreC};
        int maxScore = 0;
        for (int score : scores) {
            if (score >= maxScore) {
                maxScore = score;
            }
        }
        List<Integer> answer = new ArrayList<>();
        if (scoreA == maxScore) {
            answer.add(1);
        }
        if (scoreB == maxScore) {
            answer.add(2);
        }
        if (scoreC == maxScore) {
            answer.add(3);
        }
        return answer;
    }
}
