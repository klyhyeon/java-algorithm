package inflearn_java_algo.recursive_tree_graph;

public class BinaryBFS {

    int data;
    Node lt, rt;
}

class MainBFS {

    Node root;

    public void BFS(Node root) {
        //TODO 코드 구현하기
    }


    public static void main(String[] args) {
        MainBFS tree = new MainBFS();
        tree.root = new Node(1); //생성되는 순간 lt, rt = null
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}