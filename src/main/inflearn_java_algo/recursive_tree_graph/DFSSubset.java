package inflearn_java_algo.recursive_tree_graph;

import java.io.InputStreamReader;
import java.util.Scanner;

public class DFSSubset {
  //자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램
  //입력: 자연수 N이 주어집니다. (1<=N<=10)
  //출력: 첫 번째 줄부터 부분집합을 작은 숫자원소부터 차례대로 출력

  private static int[] ch;
  private static int maxNum;

  public static void main(String[] args) {
    Scanner sc = new Scanner(new InputStreamReader(System.in));
    maxNum = sc.nextInt();
    ch = new int[maxNum + 1];
    subset(1);
  }

  private static void subset(int num) {
    if (num == maxNum + 1) {
      for (int i = 1; i < num; i++) {
        if (ch[i] == 1) {
          System.out.print(i + " ");
        }
      }
      System.out.println();
      return;
    }
    ch[num] = 1;
    subset(num + 1);
    ch[num] = 0;
    subset(num + 1);
  }
}
