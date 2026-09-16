package programmers.dfs_bfs;

/**
 * 문제 설명
 * n개의 노드가 있는 그래프가 있습니다. 각 노드는 1부터 n까지 번호가 적혀있습니다. 1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다.
 * 가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.
 * <p>
 * 노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때,
 * 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.
 *
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

/**
 * 제한사항
 * 노드의 개수 n은 2 이상 20,000 이하입니다.
 * 간선은 양방향이며 총 1개 이상 50,000개 이하의 간선이 있습니다.
 * vertex 배열 각 행 [a, b]는 a번 노드와 b번 노드 사이에 간선이 있다는 의미입니다.
 * 입출력 예
 * n	vertex	return
 * 6	[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]	3
 * 입출력 예 설명
 * 예제의 그래프를 표현하면 아래 그림과 같고, 1번 노드에서 가장 멀리 떨어진 노드는 4,5,6번 노드입니다.
 */
public class FarNode {

//    public static int solution(int n, int[][] edge) {
//        Integer[] distances = new Integer[n + 1];
//        boolean[] visited = new boolean[n + 1];
//        Arrays.fill(distances, 0);
//        Deque<Integer> nodes = new ArrayDeque<>();
//        Map<Integer, ArrayList<Integer>> connections = new HashMap<>();
//        for (int[] e : edge) {
//            if (e[0] == 1) {
//                distances[e[1]] += 1;
//                nodes.push(e[1]);
//            } else if (e[1] == 1) {
//                distances[e[0]] += 1;
//                nodes.push(e[0]);
//            }
//            if (connections.get(min(e[0], e[1])) == null) {
//                ArrayList<Integer> newList = new ArrayList<>();
//                newList.add(max(e[0], e[1]));
//                connections.put(min(e[0], e[1]), newList);
//            } else {
//                ArrayList<Integer> ints = connections.get(min(e[0], e[1]));
//                ints.add(max(e[0], e[1]));
//                connections.put(min(e[0], e[1]), ints);
//            }
//        }
//        if (nodes.isEmpty()) {
//            return 0;
//        }
//        while (!nodes.isEmpty()) {
//            Integer node = nodes.pop();
//            if (connections.get(node) == null || visited[node]) {
//                continue;
//            }
//            visited[node] = true;
//            List<Integer> connectedNodes = connections.get(node);
//            for (Integer cn : connectedNodes) {
//                if (distances[cn] == null) {
//                    distances[cn] = 1;
//                }
//                distances[cn] += 1;
//                nodes.push(cn);
//            }
//        }
//        Arrays.sort(distances, Comparator.reverseOrder());
//        return (int) Arrays.stream(distances).filter(i -> Objects.equals(i, distances[0])).count();
//    }

    public static int solution(int n, int[][] edge) {

        // 1. 그래프 생성
        ArrayList<Integer>[] graph = new ArrayList[n + 1];

        // 2. 각 노드의 인접 리스트 초기화
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 3. edge를 이용해서 양방향으로 연결
        // graph[a].add(b);
        // graph[b].add(a);
        for (int[] e : edge) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }


        // 4. BFS 준비
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];


        // 5. 1번 노드에서 시작
        visited[1] = true;
        queue.add(1);


        // 6. BFS
        while (!queue.isEmpty()) {

            int current = queue.poll();

            for (int next : graph[current]) {

                // 이미 방문했다면 skip
                if (visited[next]) {
                    continue;
                }

                // 방문 처리
                visited[next] = true;

                // 거리 계산
                distance[next] = distance[current] + 1;

                // queue에 추가
                queue.add(next);
            }
        }

        // 7. 가장 먼 거리 찾기
        int max = Arrays.stream(distance).max().orElse(0);

        // 8. 그 거리와 같은 노드 개수 세기
        return Math.toIntExact(Arrays.stream(distance).filter(i -> i == max).count());
    }

    public static void main(String[] args) {
        System.out.println(FarNode.solution(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}}));
    }
}
