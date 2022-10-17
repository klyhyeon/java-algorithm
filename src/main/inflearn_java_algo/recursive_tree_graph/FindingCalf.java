package inflearn_java_algo.recursive_tree_graph;

public class FindingCalf {
    public static void main(String[] args){

    }

    //TODO 코드 완성
    public void solution(int hs, int calf) {
        int goal = calf - hs;
        int min = 0;
        while (goal == 0) {
            if (goal > 5) {
                min += 1;
                goal -= 5;
            }
        }
    }
}