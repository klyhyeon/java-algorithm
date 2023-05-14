package programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class Phonecketmon {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        answer = Math.min(nums.length / 2, numsSet.size());
        return answer;
    }
}
