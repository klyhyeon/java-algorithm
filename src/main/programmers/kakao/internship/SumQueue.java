package programmers.kakao.internship;

import java.util.LinkedList;
import java.util.Queue;

public class SumQueue {
    /*
    1. 두 큐의 합이 같을 때까지 poll, add 반복
    2. 횟수가 min 되는 answer를 찾기
    3. type은 long으로 잡기
    4. 예외는 차후 고려
     */

    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> queueA = new LinkedList<>();
        Queue<Integer> queueB = new LinkedList<>();
        long queueASum = 0;
        long queueBSum = 0;
        for (int i = 0; i < queue1.length; i++) {
            int queue1Value = queue1[i];
            queueA.add(queue1Value);
            queueASum += queue1Value;
            int queue2Value = queue2[i];
            queueB.add(queue2Value);
            queueBSum += queue2Value;
        }

        int answer = 0;
        int maxLoopCount = queue1.length * 2;
        while (maxLoopCount > 0 && !queueA.isEmpty() && !queueB.isEmpty()) {
            if (queueASum == queueBSum) {
                break;
            }
            if (queueASum > queueBSum) {
                int queueAHead = queueA.poll();
                queueB.add(queueAHead);
                queueASum -= queueAHead;
                queueBSum += queueAHead;
            } else {
                int queueBHead = queueB.poll();
                queueA.add(queueBHead);
                queueBSum -= queueBHead;
                queueASum += queueBHead;
            }
            answer++;
            maxLoopCount--;
        }
        if (queueA.isEmpty() || queueB.isEmpty() || queueASum != queueBSum) {
            return -1;
        }
        return answer;
    }
}
