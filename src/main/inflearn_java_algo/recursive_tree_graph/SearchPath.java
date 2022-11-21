package inflearn_java_algo.recursive_tree_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchPath {

    //1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력
    //한 번 방문한 노드는 재방문하지 않는다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        int n = firstLine.charAt(0) - 48;
        int m = firstLine.charAt(2) - 48;
        int[][] graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            graph[i1][i2] = 1;
        }
    }
}