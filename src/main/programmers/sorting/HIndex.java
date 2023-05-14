package programmers.sorting;

import java.util.Arrays;

public class HIndex {

    //n편 중 인용 h편 이상이 h번 이상 인용되었다면 h의 최댓값이 H-Index
    //**나머지 논문은 h번 이하 인용되어야함**
    //count = idx value 만큼 인용된 논문 수
    //idx value <= count
    //idx value의 최댓값이 answer
    public static int solution(int[] citations) {
        int max = 0;
        Arrays.sort(citations);
        int length = citations.length;
        for (int i = 0; i < length; i++) {
            int count = length - i;
            //count에 맞춰야 되는 이유는 인용횟수보다 큰 h-index가 존재할 수 있기 때문이다. 하지만 count보다 큰 h-index는 존재할 수 없다.
            if (citations[i] >= count) {
                max = count;
                break;
            }
        }
        return max;
    }

}
