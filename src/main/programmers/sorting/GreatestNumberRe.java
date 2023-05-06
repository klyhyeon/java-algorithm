package programmers.sorting;

import java.util.Arrays;

public class GreatestNumberRe {

    public String solution(int[] numbers) {
        String answer = "";
        //1. int 배열을 String 배열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        //2. String 배열을 정렬
        Arrays.sort(strNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        //3. 정렬된 String 배열을 순서대로 answer에 저장
        StringBuilder sb = new StringBuilder();
        for (String strNumber : strNumbers) {
            sb.append(strNumber);
        }
       //4. answer 첫번째 값이 0이면 0을 리턴
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}
