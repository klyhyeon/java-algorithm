package inflearn_java_algo.recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FindingCalf {

    static boolean[] checkPoints = new boolean[10001];

    static int calfStatic = 0;

    static Queue<Integer> checkPointBox = new LinkedList<>();

    static int answer = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        System.out.println(solution(input1, input2));
    }

    public static int solution(int hs, int calf) {
        calfStatic = calf;

        checkPointBox.offer(hs);
        while (!checkPointBox.isEmpty()) {
            answer++;
            int checkPointBoxSize = checkPointBox.size();
            for (int i = 0; i < checkPointBoxSize; i++) {
                hs = checkPointBox.poll();
                if (BFS(hs, 1) || BFS(hs, -1) || BFS(hs, 5)) {
                    return answer;
                }
                checkPointBox.offer(hs + 1);
                checkPointBox.offer(hs - 1);
                checkPointBox.offer(hs + 5);
            }
        }
        return answer;
    }

    private static boolean BFS(int hs, int i) {
        if (hs + i < 0 || checkPoints[hs + i]) {
            return false;
        }

        if (hs + i == calfStatic) {
            return true;
        }
        checkPoints[hs + i] = true;
        return false;
    }
}