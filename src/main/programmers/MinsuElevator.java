package programmers;

public class MinsuElevator {
  /*
  -1, 1, 10, -10, 100, -100...
  0으로 만들기위한 최소 경우의 수
  큰 값부터 빼야함
  1. 자릿수 * 10만큼 빼기
  2. 자릿수를 높였을 때 큰 값으로 뺄 수 있는 횟수와 그렇지 않을 때를 비교해야 함
  3. 각 자릿수를 모두 더했을 때 vs
   */
  // public int solution(int storey) {
  //   int answer = 0;
  //   String storeyString = String.valueOf(storey);
  //   if (storey / storeyString.length() < 5
  //   && storey / (storeyString.length() - 1) >= 5) {
  //     answer = (storey / storeyString.length()) + 1 + storey;
  //   }
  //   return answer;
  // }

  public int solution(int storey) {
    return elevator(storey);
  }

  private int elevator(int floor) {
    if(floor <= 1) return floor;

    int under10 = floor % 10;
    int rest = floor / 10;

    int c1 = under10 + elevator(rest);
    int c2 = (10 - under10) + elevator(rest + 1);
    return Math.min(c1, c2);
  }
}
