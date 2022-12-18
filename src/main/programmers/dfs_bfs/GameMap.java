package programmers.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {

    /*
    1. 2차원 배열에 맵 구조 담기 (n x m)
    2. 내 위치(1,1), 상대 위치(n, m)
    3. 이동 방식 (x, y) -> (x + 1, y) or (x, y + 1) or (x - 1, y) or (x, y - 1)
    4. 이동 조건 map[x + 1][y] == 1, flag[x + 1][y] == false
    5. 처음부터 경로 여러 개 중 가장 count가 짧은 하나를 고른다고 생각하기
    6. 상대 위치에 도달하지 못했을 경우, flag[n][m] == false라면 return -1
    https://taehoung0102.tistory.com/122

    1. 최소경로는 BFS를 사용한다. FIXME (이유 필요) -> 송아지 찾기 강의 보기
    2. queue에 좌표값을 가진 객체를 저장한다.
    3. 좌표마다 count를 저장할 배열을 만든다.
    3. queue이 empty될 때까지 poll 한다.
    4. poll한 객체는 동,서,남,북 4번의 방향으로 움직여본다.
    5. 움직일 수 있다면, 움직인 좌표에 맞게 현재 좌표의 count + 1을 좌표 배열에 저장한다.
    6. 움직인 좌표는 벽으로 만든다.
    8. queue에 움직인 좌표를 넣는다. (이 좌표에서 동,서,남,북 움직여 봐야하기 때문에)
    9. 상대의 위치는 맨 끝이기 때문에, 좌표를 벗어나려 하면 continue해서 queue에 넣지 않고 continue한다.
     */

    public int solution(int[][] maps) {
        int answer = 0;
        int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<Position> que = new LinkedList();
        int[][] count = new int[maps.length][maps[0].length];

        que.add(new Position(0, 0));
        count[0][0] = 1;

        while (!que.isEmpty()) {
            Position cur = que.poll();
            int curcount = count[cur.y][cur.x];
            for (int i = 0; i < 4; i++) {
                Position p = new Position(cur.x + move[i][0], cur.y + move[i][1]);
                //맵밖으로 나갈때
                if (p.x < 0 || p.y < 0 || p.x == maps[0].length || p.y == maps.length) {
                    continue;
                }
                //벽에 부딪힐때
                if (maps[p.y][p.x] == 0) {
                    continue;
                }
                count[p.y][p.x] = curcount + 1;
                //이미 지난길은 벽으로 만들어버리기
                maps[p.y][p.x] = 0;
                que.add(p);
            }
        }
        answer = count[maps.length - 1][maps[0].length - 1];
        if (answer == 0) {
            return -1;
        }
        return answer;
    }

}

class Position {
    int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

