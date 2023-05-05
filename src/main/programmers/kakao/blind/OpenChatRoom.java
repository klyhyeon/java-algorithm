package programmers.kakao.blind;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChatRoom {
    /*
     * ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
     * ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
     */

    /*
     * 1. 유저 네임을 고쳐주기
     * 2. 커맨드에 따라 문장을 한글로 수정해주기
     * 3. UserInfo 클래스와 Command 클래스 만들기
     */

    class UserInfo {

        String userName;

        char action;

        public UserInfo(String userName, char action) {
            this.userName = userName;
            this.action = action;
        }
    }

    class CommandInfo {

        char command;

        String userName;
    }

    public List<String> solution(String[] record) {
        Map<String, UserInfo> userIdInfoMap = new HashMap<>();
        String[] answer = new String[record.length];
        for (String str : record) {
            String[] words = str.split(" ");
            if (str.charAt(0) == 'E') {
                userIdInfoMap.put(words[1], new UserInfo(words[2], 'E'));
            }
        }

        int i = 0;
//    for (String str : record) {
//      Iterator<Map.Entry<String, String>> iterator = userInfo.entrySet().iterator();
//      while (iterator.hasNext()) {
//        Map.Entry<String, String> entrySet = iterator.next();
//        if (str.contains(entrySet.getKey())) {
//          String[] words = str.split(" ");
//          String action = words[0];
//          String convertedAction;
//          if (action.equals("Enter")) {
//            convertedAction = "들어왔습니다.";
//          } else if (action.equals("Leave")) {
//            convertedAction = "나갔습니다.";
//          } else {
//            continue;
//          }
//          answer[i] = entrySet.getValue() + "님이 " + convertedAction;
//        }
//      }
//      i++;
//    }
//    return answer;
        return null;
    }
}

