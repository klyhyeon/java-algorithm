package programmers.kakao.internship;

import java.util.HashMap;
import java.util.Map;

public class Mbti {

    /*
    각 유형이 같게 나오면, 사전 순으로 함
    - survey(질문 유형) - 첫 글자는 비동의 유형임 1000이하 수
    - choices(선택지) - 선택한 선택지

    구현
    1. 상대되는 유형 중 점수를 비교하는 함수
    2. 점수를 합산하는 함수
    3. 점수가 같은 경우 사전순으로 Return

    로직
    1 - 3
    2 - 2
    3 - 1
    4 - 0
    5 - 1
    6 - 2
    7 - 3

    자료구조
    Map - Key, Value
     */
    //"RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"

    public String solution() {
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};
        Map<String, Integer> mbtiValues = new HashMap<>();
        mbtiValues.put("R", 0);
        mbtiValues.put("T", 0);
        mbtiValues.put("F", 0);
        mbtiValues.put("C", 0);
        mbtiValues.put("M", 0);
        mbtiValues.put("J", 0);
        mbtiValues.put("A", 0);
        mbtiValues.put("N", 0);

        //sum scores
        getSum(mbtiValues, survey, choices);
        String[] candidates = {"RT", "FC", "MJ", "NA"};
        return getMbti(candidates, mbtiValues);
    }

    private String getMbti(String[] candidates, Map mbtiValues) {
        String answer = "";
        for (String s : candidates) {
            String former = s.substring(0, 1);
            String latter = s.substring(1, 2);
            int formerValue = (Integer) mbtiValues.get(former);
            int latterValue = (Integer) mbtiValues.get(latter);
            if (formerValue == latterValue) {
                answer += former.compareTo(latter) < 0 ? former : latter;
                continue;
            }

            if (formerValue > latterValue) {
                answer += former;
                continue;
            }
            answer += latter;
        }
        return answer;
    }

    public void getSum(Map mbtiValues, String[] survey, int[] choices) {
        for (int i = 0; i < survey.length; i++) {
            String negativeType = survey[i].substring(0, 1);
            String positiveType = survey[i].substring(1, 2);
            int value;
            switch (choices[i]) {
                case 1:
                    value = (Integer) mbtiValues.get(negativeType);
                    mbtiValues.put(negativeType, value + 3);
                    break;
                case 2:
                    value = (Integer) mbtiValues.get(negativeType);
                    mbtiValues.put(negativeType, value + 2);
                    break;
                case 3:
                    value = (Integer) mbtiValues.get(negativeType);
                    mbtiValues.put(negativeType, value + 1);
                    break;
                case 4:
                    break;
                case 5:
                    value = (Integer) mbtiValues.get(positiveType);
                    mbtiValues.put(positiveType, value + 1);
                    break;
                case 6:
                    value = (Integer) mbtiValues.get(positiveType);
                    mbtiValues.put(positiveType, value + 2);
                    break;
                case 7:
                    value = (Integer) mbtiValues.get(positiveType);
                    mbtiValues.put(positiveType, value + 3);
                    break;
            }
        }
    }
}
