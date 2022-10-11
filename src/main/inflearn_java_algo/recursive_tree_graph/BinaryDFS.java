package inflearn_java_algo.recursive_tree_graph;

class Node {
  int data;
  Node lt, rt;

  public Node(int val) {
    this.data = val;
    lt = rt = null;
  }
}

public class BinaryDFS {

  //이진트리는 부모 - 왼쪽 자식, 오른쪽 자식이 기본 구성
  //깊이우선탐색 - 한 노드씩 한 방향의 끝까지 갔다가 돌아옴, 갈때까지 갔다가 갈때가 없으면 뒤로 돌아옴
  //전위순회(출력): 부모 - 왼 - 오
  //중위순회: 왼 - 부 - 오
  //후위순회: 왼 - 오 - 부 (병합정렬)
}

class Main {

  Node root;

  public void DFS(Node root) {
    if (root == null) {
      return;
    }
    DFS(root.lt);
    System.out.print(root.data + " ");
    DFS(root.rt);
  }


  public static void main(String[] args) {
    Main tree = new Main();
    tree.root = new Node(1); //생성되는 순간 lt, rt = null
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.DFS(tree.root);
  }
}
