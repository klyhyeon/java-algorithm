package programmers.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clothes {
  public int solution(String[][] clothes) {
    int answer = 0;
    Map<String, Integer> clothesKindMap = new HashMap<>();
    for (String[] clothesSet : clothes) {
      Integer clothesCount = clothesKindMap.get(clothesSet[1]);
      if (clothesCount == null) {
        clothesCount = 1;
      }
      clothesKindMap.put(clothesSet[1], ++clothesCount);
    }
    if (clothesKindMap.size() > 0) {
      List<Integer> v = new ArrayList<>(clothesKindMap.values());
      int multipliedResult = 1;
      for (Integer integer : v) {
        multipliedResult *= integer;
      }
      answer += multipliedResult;
    }
    return answer - 1;
  }
}
