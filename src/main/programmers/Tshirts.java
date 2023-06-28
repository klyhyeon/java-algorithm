package programmers;

import java.util.Arrays;

public class Tshirts {

  public int solution(int[] people, int[] tshirts) {
    int answer = 0;
    Arrays.sort(people);
    Arrays.sort(tshirts);
    boolean[] flag = new boolean[tshirts.length];
    for (int i = 0; i < people.length; i++) {
      for (int j = 0; j < tshirts.length; j++) {
        if (!flag[j]) {
          if (tshirts[j] >= people[i]) {
            flag[j] = true;
            answer++;
            break;
          }
        } else {
          continue;
        }
      }
    }
    return answer;
  }
}
