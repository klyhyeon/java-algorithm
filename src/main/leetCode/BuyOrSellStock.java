package leetCode;

// 12:40 ~

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

import static java.lang.Math.max;

/**
 *  * Example 1:
 *  *
 *  * Input: prices = [7,1,5,3,6,4]
 *  * Output: 5
 *  * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *  * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 *  * Example 2:
 *  *
 *  * Input: prices = [7,6,4,3,1]
 *  * Output: 0
 *  * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 *  Constraints:
 *
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */

// 반복문 한번에 비교. 가장 낮은 가격을 사서, 가장 높은 가격에 팔아야 함. 그 차가 0보다 같거나 작으면 answer는 변하지 않고 리턴됨.
// min, max와 현재 값을 비교. min이 변경되면 max가 리셋된다. 이전의 max 값은 저장해둔다.
//
public class BuyOrSellStock {

    public static int maxProfit(int[] prices) {
        int answer = 0;
        int max = prices[0];
        int min = prices[0];
        int currentMax = answer;
        for (int price : prices) {
            if (price > max) {
                max = price;
                answer = max - min;
                continue;
            }
            if (price < min) {
                currentMax = max(currentMax, max - min);
                min = price;
                max = price;
            }
        }
        return max(answer, currentMax);
    }

    public static void main(String[] args) {
        System.out.println(BuyOrSellStock.maxProfit(new int[]{4,11,2,7,1}));
    }
}
