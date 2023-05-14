package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    //15:20~15:30 - 효율성 테스트 실패
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = 0; j < phone_book.length; j++) {
//                if (phone_book[i].length() < phone_book[j].length()) {
//                    if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
//                        answer = false;
//                        break;
//                    }
//                }
//            }
//        }
//        return answer;
//    }

    //15:30~
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}
