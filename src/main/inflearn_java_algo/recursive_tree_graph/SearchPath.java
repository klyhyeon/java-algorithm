package inflearn_java_algo.recursive_tree_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchPath {

    //1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력
    //한 번 방문한 노드는 재방문하지 않는다
    /*
    5 9
    1 2
    1 3
    1 4
    2 1
    2 3
    2 5
    3 4
    4 2
    4 5
     */

    private static int v;

    private static int answer = 0;

    private static int[][] graph;

    private static int[] checkedPoints;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        v = firstLine.charAt(0) - 48;
        int m = firstLine.charAt(2) - 48;
        graph = new int[v + 1][v + 1];
        checkedPoints = new int[v + 1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            graph[i1][i2] = 1;
        }
        checkedPoints[1] = 1;
        dfs(1);
        System.out.println("answer is: " + answer);
    }

    private static void dfs(int n) {
        if (n == v) {
            answer++;
        } else {
            for (int i = 1; i <= v; i++) {
                if (graph[n][i] != 1 || checkedPoints[i] == 1) {
                    continue;
                }
                checkedPoints[i] = 1;
                dfs(i);
                checkedPoints[i] = 0;

            }
        }
    }
}