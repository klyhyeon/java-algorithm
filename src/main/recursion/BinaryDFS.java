package recursion;

public class BinaryDFS {

    Node root;
    public void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.lt);
        dfs(root.rt);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryDFS tree = new BinaryDFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }

}

class Node {
    int data;
    Node lt;
    Node rt;
    public Node(int val) {
        this.data = val;
        lt = null;
        rt = null;
    }
}
