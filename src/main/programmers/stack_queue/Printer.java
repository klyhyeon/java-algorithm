package programmers.stack_queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Printer {

    /*
    Queue: FIFO
    Stack: LIFO
     */
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            queue.add(priority);
        }
        int answer = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
