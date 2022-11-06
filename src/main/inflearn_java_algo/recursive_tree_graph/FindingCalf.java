package inflearn_java_algo.recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FindingCalf {

    static boolean[] checkPoints = new boolean[10001];

    static int[] movingDistances = {5, 1, -1};

    static Queue<Integer> remainingCheckPoints = new LinkedList<>();

    static int answer = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        System.out.println(solution(input1, input2));
    }

    public static int solution(int startPoint, int calfPoint) {

        remainingCheckPoints.offer(startPoint);
        checkPoints[startPoint] = true;
        while (!remainingCheckPoints.isEmpty()) {
            int len = remainingCheckPoints.size();
            for (int i = 0; i < len; i++) {
                int currentPoint = remainingCheckPoints.poll();

                for (int md : movingDistances) {
                    int movedPoint = currentPoint + md;
                    if (movedPoint < 1 || movedPoint > 10000 || checkPoints[movedPoint]) {
                        continue;
                    }
                    if (movedPoint == calfPoint) {
                        return ++answer;
                    }
                    checkPoints[movedPoint] = true;
                    remainingCheckPoints.offer(movedPoint);
                }
            }
            answer++;
        }
        return answer;
    }
}