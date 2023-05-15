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
                clothesCount = 0;
            }
            clothesKindMap.put(clothesSet[0], ++clothesCount);
        }
        answer = clothes.length;
        if (clothesKindMap.size() > 1) {
            List<Integer> v = new ArrayList<>(clothesKindMap.values());
            int multipliedNum = 1;
            for (Integer integer : v) {
                multipliedNum *= integer;
            }
            answer += multipliedNum;
        }
        return answer;
    }
}
