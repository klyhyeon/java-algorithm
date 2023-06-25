package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class NetworkRe {

  public int solution(int n, int[][] computers) {
    int answer = 0;
    boolean[] visited = new boolean[n];
    Queue<Integer> nodes = new LinkedList<Integer>();
    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        for (int j = 0; j < n; j++) {
          if (i == j) {
            continue;
          }
          if (computers[i][j] == 1) {
            visited[j] = true;
            nodes.add(j);
          }
        }
        while (!nodes.isEmpty()) {
          Integer connectedNode = nodes.poll();
          visited[connectedNode] = true;
        }
        answer++;
      }
    }
    return answer;
  }
}
