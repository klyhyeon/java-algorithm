package programmers.sorting;

import java.util.Arrays;

public class GreatestNumber {

    public String solution(int[] numbers) {
        //12:55 ~ 13:30 (실패)
        //배열 숫자들을 조합해 가장 큰 수를 반환
        String answer = "";
        String[] stringNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(stringNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        StringBuilder sb = new StringBuilder();
        for (String stringNumber : stringNumbers) {
            sb.append(stringNumber);
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}
