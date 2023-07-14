package programmers;

public class FastestPath {

  int[] dx = {1, 0, -1, 0};
  int[] dy = {0, 1, 0, -1};

  //최단거리 맵
  public int solution(int[][] map) {
    int answer = 0;
    boolean[][] visited = new boolean[map.length][map[0].length];
    int[][] count = new int[map.length][map[0].length];

    return answer;
  }
}

//TODO Queue 만들고 객체 완성
class Coordinate {

  int x;

  int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
