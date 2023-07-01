package programmers;

public class Budget {

  public int solution(int[] budgets, int M) {
    int answer = 0;
    int max = 0;
    int min = 0;
    for (int budget : budgets) {
      if (budget >= max) {
        max = budget;
      }
    }
    while (min <= max) {
      int mid = (max + min) / 2;
      int sum = 0;
      for (int budget : budgets) {
        if (budget > mid) {
          sum += mid;
        } else {
          sum += budget;
        }
      }
      if (sum > M) {
        //min <-> max 범위 내에서 해(answer)가 있다는 것이니, mid가 해가 아니었기 때문에 mid를 제외하고 범위를 재정의해야 함
        max = mid - 1;
      } else {
        min = mid + 1;
        answer = sum;
      }
    }
    return answer;
  }
}
