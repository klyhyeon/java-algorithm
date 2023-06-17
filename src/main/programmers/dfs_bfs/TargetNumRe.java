package programmers.dfs_bfs;

import java.util.PriorityQueue;
import java.util.Queue;

public class TargetNumRe {
  /*
  모르겠는 것
  1. 이전 노드로 갈 때 기연산된 값을 sum에 리셋해주기
  2. 메서드 마지막 라인의 return을 어떻게 해줘야할지
   */

  int answer = 0;

  public int solution(int[] numbers, int target) {
    dfs(numbers, 0, target, 0);
    return answer;
  }

  private void dfs(int[] numbers, int idx, int target, int sum) {
    if (numbers.length <= idx) {
      if (sum == target) {
        answer++;
      }
    } else {
      dfs(numbers, idx + 1, target, sum + numbers[idx]);
      dfs(numbers, idx + 1, target, sum - numbers[idx]);
    }
  }
}
