package coding_test.gabia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstCoffee {

    /*
     * N개씩 재귀
     * N+1번째부터 2N+1까지는 N번째까지 오름차순으로 정렬해 더한 시간만큼 걸림. 이후에도 반복
     * 커피가 만들어지는 순서
     */

    public List<Integer> solution(int N, int[] coffee_times) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int idx = 0;
        int rounds = coffee_times.length / N;
        if (coffee_times.length % N != 0) {
            rounds++;
        }
        while (rounds > 0) {
            int smallIdx = 0;
            if (rounds == coffee_times.length / N) {
                for (int time : coffee_times) {
                    if (idx == coffee_times.length) {
                        break;
                    }
                    if (smallIdx == N) {
                        continue;
                    }
                    answer.add(time);
                    temp.add(time);
                    idx++;
                    smallIdx++;
                }
                Collections.sort(temp);
                rounds--;
                continue;
            }
            for (int i = 0; i < N; i++) {

            }
            rounds--;

        }
        return answer;
    }

    void round(int N, int[] coffee_times) {
        int[] temp = new int[N];
        int[] answer = new int[100];
        int j = 0;
        for (int i = 0; i < N; i++) {
            answer[j] = temp[i] + coffee_times[j];
            temp[i] += coffee_times[j];
        }
        Arrays.sort(temp);
    }
}
