package programmers.stack_queue;

public class Bracket {

    boolean solution(String s) {
        boolean answer = true;
        char open = '(';
        int openCount = 0;
        int closeCount = 0;
        int openCloseSum = 0;

        for (char bracket : s.toCharArray()) {
            if (bracket == open) {
                openCount++;
            } else {
                closeCount++;
            }

            if (bracket == open) {
                openCloseSum++;
            } else {
                openCloseSum--;
            }
            if (openCloseSum < 0) {
                answer = false;
                break;
            }
        }

        if (openCount != closeCount) {
            answer = false;
        }

        return answer;
    }
}
