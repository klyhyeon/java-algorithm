package pretest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

public class Number2 {
    public static int solution(int n, int[][] edges) {
        Arrays.sort(edges, Comparator.comparingInt((int[] o) -> o[0]).thenComparingInt(o -> o[1]));
        int answer = 0;
        boolean[] visited = new boolean[n + 1];
        int[] distances = new int[n + 1];
        ArrayList<Integer>[] links = new ArrayList[n + 1];
        for (int[] e : edges) {
            if (links[e[0]] == null) {
                links[e[0]] = new ArrayList<>();
            }
            if (links[e[1]] == null) {
                links[e[1]] = new ArrayList<>();
            }
            links[e[0]].add(e[1]);
            links[e[1]].add(e[0]);
        }
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        while (!q.isEmpty()) {
            int node = q.poll();
            if (visited[node]) continue;
            visited[node] = true;
            for (int child : links[node]) {
                if (distances[child] == 0 && child != 1) {
                    distances[child] = distances[node] + 1;
                    q.add(child);
                }
            }
        }
        int max = Arrays.stream(distances).max().orElse(0);
        answer = (int) Arrays.stream(distances).filter(i -> i == max).count();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Number2.solution(4, new int[][]{
//                {3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}
                {1,2},{2,3},{3,4}
        }));
    }
}
