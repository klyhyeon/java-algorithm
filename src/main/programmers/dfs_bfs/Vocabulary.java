package programmers.dfs_bfs;

public class Vocabulary {

    /*
    1. begin이 변환될 수 있는 words들을 찾기
    2. 변환될 수 있다면 현재 target과 일치하는 글자 수보다 더 큰지 비교
    3. 이미 비교한 words들은 다시 실행하지 않도록 flag(boolean)으로 표시
    4. 다 돌았을 때 target과 일치하는 글자 수가 < target.length()라면 리턴
     */

    static boolean[] visited;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            int k = 0;    // 같은 스펠링 몇개인지 세기
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }

            if (k == begin.length() - 1) {  // 한글자 빼고 모두 같은 경우
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}
