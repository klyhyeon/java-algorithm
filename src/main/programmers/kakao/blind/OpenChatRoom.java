//package programmers.kakao.blind;
//
//import java.sql.Array;
//import java.util.*;
//
//public class OpenChatRoom {
//  /*
//   * ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
//   * ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
//   */
//
//  /*
//   * 1. 유저 네임을 고쳐주기
//   * 2. 커맨드에 따라 문장을 한글로 수정해주기
//   * 3. UserInfo 클래스와 Command 클래스 만들기
//   * 4. UserInfo : userName, action -> Map<userId, UserInfo>
//   * 5. List, userId, Command
//   */
//
//  class UserInfo {
//
//    String userName;
//
//    char action;
//
//    public UserInfo(String userName, char action) {
//      this.userName = userName;
//      this.action = action;
//    }
//
//    public void setUserName(String userName) {
//      this.userName = userName;
//    }
//  }
//
//  class UserCommand {
//
//    String userId;
//
//    char action;
//
//    public UserCommand(String userId, char action) {
//      this.userId = userId;
//      this.action = action;
//    }
//  }
//
//  public List<String> solution(String[] record) {
//    String[] answer = new String[record.length];
//    Map<String, UserInfo> userIdInfoMap = new LinkedHashMap<>();
//    List<UserCommand> userCommands = new ArrayList<>();
//    for (String str : record) {
//      String[] words = str.split(" ");
//      if (str.charAt(0) == 'E') {
//        if (userIdInfoMap.containsKey(words[1])) {
//          userIdInfoMap.get(words[1]).setUserName(words[2]);
//        } else {
//          userIdInfoMap.put(words[1], new UserInfo(words[2], 'E'));
//        }
//        userCommands.add(new UserCommand(words[1], 'E'));
//      } else if (str.charAt(0) == 'L') {
//        if (userIdInfoMap.containsKey(words[1])) {
//          userIdInfoMap.get(words[1]).setUserName(words[2]);
//        } else {
//          userIdInfoMap.put(words[1], new UserInfo(words[2], 'L'));
//        }
//        userCommands.add(new UserCommand(words[1], 'L'));
//      } else {
//        //TODO 이름 변경될 때 userIdInfoMap 갱신로직 추가하기
//      }
//    }
//
//    int i = 0;
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
//  }
//}
//
