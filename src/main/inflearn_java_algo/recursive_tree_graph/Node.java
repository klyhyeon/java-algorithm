package inflearn_java_algo.recursive_tree_graph;

public class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        lt = rt = null;
    }
}