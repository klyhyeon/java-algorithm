package programmers.kakao.blind;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OpenChatRoom {

    public String[] solution(String[] record) {
        String[] answer = new String[record.length];
        Map<String, String> userInfo = new HashMap<>();
        for (String str : record) {
            String[] strs = str.split(" ");
            String action = strs[0];
            String userId = strs[1];
            String nickName = strs[2];
            if (action.equals("Enter")) {
                userInfo.put(userId, nickName);
            }
        }
        for (String str : record) {
            Iterator<Map.Entry<String, String>> iterator = userInfo.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entrySet = iterator.next();
                if (str.contains(entrySet.getKey())) {
                    answer[i] = entrySet.getValue() + " ";
                }
            }
        }
        return answer;
    }
}

