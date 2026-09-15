package string;

/**
 * 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은
 * 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

/**
 * 제한사항
 * my_string은 숫자와 알파벳으로만 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * 0 ≤ s ≤ e < my_string의 길이
 */

/**
 * 입출력 예
 * my_string	s	e	result
 * "Progra21Sremm3"	6	12	"ProgrammerS123"
 * "Stanley1yelnatS"	4	10	"Stanley1yelnatS"
 */

public class ReverseString {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        String reversedSubStr = new StringBuilder(sb.substring(s, e + 1)).reverse().toString();
        sb.replace(s, e + 1, reversedSubStr);
        return sb.toString();
    }
}
