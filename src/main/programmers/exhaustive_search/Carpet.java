package programmers.exhaustive_search;

public class Carpet {

  //중앙은 노란색, 테두리 1줄은 갈색
  //가로는 세로보다 같거나 길어야 함
  public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];
    //(12, 4)
    /*
     1. yellow의 가로: 2 (while, yellow 가로 < yellow)
     - yellow의 세로: yellow / yellow의 가로
     - brown의 가로: yellow의 가로 + 2
     - brown의 세로: brown / brown의 가로
     - if (brown의 전체 == 주어진 brown의 전체) -> answer
     */
    int yellowWidth = 0;
    int yellowHeight = 0;
    int brownWidth = 0;
    int brownHeight = 0;
    while (yellowHeight <= (yellow / 2)) {
      yellowHeight++;
      yellowWidth = yellow / yellowHeight;
      if (yellowWidth * yellowHeight != yellow) {
        continue;
      }
      brownWidth = yellowWidth + 2;
      brownHeight = yellowHeight;
      if (brownWidth * 2 + brownHeight * 2 != brown) {
        continue;
      }
      answer[0] = brownWidth;
      answer[1] = brownHeight + 2;
      break;
    }
    return answer;
  }
}
