package inflearn_java_algo.recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestToBottom {

  public static void main(String[] args) {
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    //DFS
    System.out.println(DFS(0, tree.root));

    //BFS
    System.out.println(BFS(0, tree.root));
  }

  public static int DFS(int level, Node node) {
    if (node.lt == null && node.rt == null) {
      return level;
    }
    level++;
    return Math.min(DFS(level, node.lt), DFS(level, node.rt));
  }

  public static int BFS(int level, Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.offer(node);
    while (!queue.isEmpty()) {
      int len = queue.size();
      for (int i = 0; i < len; i++) {
        Node currentNode = queue.poll();
        if (currentNode.lt == null && currentNode.rt == null) {
          return level;
        }
        queue.offer(currentNode.lt);
        queue.offer(currentNode.rt);
      }
      level++;
    }
    return 0;
  }
}
