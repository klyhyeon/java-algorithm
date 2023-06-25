package programmers;

import java.util.Arrays;

public class GreatestNum {

  public String solution(int[] numbers) {
    String answer = "";
    int length = numbers.length;
    String[] stringNums = new String[length];
    for (int i = 0; i < length; i++) {
      stringNums[i] = String.valueOf(numbers[i]);
    }
    Arrays.sort(stringNums, (o1, o2) ->
        (o2 + o1).compareTo(o1 + o2));
    if (stringNums[0] == "0") {
      return "0";
    }
    return answer;
  }
}
