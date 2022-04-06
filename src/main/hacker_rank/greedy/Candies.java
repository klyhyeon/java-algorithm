package hacker_rank.greedy;

import java.util.Arrays;
import java.util.List;

public class Candies {

    public static void main(String[] args) {
//        System.out.println(
//                countMinCandies(new int[]{
//                                2,
//                                4,
//                                2,
//                                6,
//                                1,
//                                7,
//                                8,
//                                9,
//                                2,
//                                1, //i + 1보다 크기 때문에 2가 된다면 i - 1도 3이 돼야한다.
//                                0,
//                                1
//                        }
//                ));
        System.out.println(
                candies(12, List.of(
                                2,
                                4,
                                2,
                                6,
                                1,
                                7,
                                8,
                                9,
                                2,
                                1, //i + 1보다 크기 때문에 2가 된다면 i - 1도 3이 돼야한다.
                                0,
                                1)
                ));
    }

    public static long candies(int n, List<Integer> arr) {
        // Write your code here
        long result = 0;
        int[] resultArr = new int[n];
        Arrays.fill(resultArr, 1);

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr.get(0) > arr.get(1)) {
                    ++resultArr[i];
                }
                continue;
            }

            if (arr.get(i) > arr.get(i - 1)) {
                resultArr[i] = resultArr[i - 1] + 1;
            }
        }

        for (int i = n - 2; i > 0; i--) {
            if (arr.get(i) > arr.get(i + 1) && resultArr[i] <= resultArr[i + 1]) {
                resultArr[i] = resultArr[i + 1] + 1;
            }
        }

        for (int ele : resultArr) {
            result += ele;
        }
        return result;
    }

    private static int countMinCandies(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        for (int i = 0; i < candies.length; ) {
            if (i > 0 && ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
                candies[i] = candies[i - 1] + 1;
                i--;
            } else if (i < candies.length - 1 && ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
                if (i > 0) i--;
            } else i++;
        }

        int totalCandies = 0;
        for (int c : candies) {
            totalCandies += c;
        }

        return totalCandies;
    }
}
