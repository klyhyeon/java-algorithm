package hacker_rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DynamicProgrammingCoin {

    private static class Key extends ArrayList<Integer> {
        public Key(Set<Integer> coins, int value) {
            add(value);
            addAll(coins);
        }
    }

    private static Map<Key, Integer> map = new HashMap<>();

    private static int countChange(SortedSet<Integer> coins, int value) {
        if(value <= 0 || coins.isEmpty()) {
            return 0;
        }
        Key key = new Key(coins, value);
        Integer result = map.get(key);
        if(result == null) {
            // we know it isn't empty at this point
            int coin = coins.first();
            SortedSet<Integer> coinsWithout = new TreeSet<>(coins);
            coinsWithout.remove(coin);

            int resultWithout = countChange(coinsWithout, value);
            int resultWith = value == coin ? 1 : countChange(coins, value - coin);

            result = resultWithout + resultWith;
            map.put(key, result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SortedSet<Integer> coins = new TreeSet<>();
        for(String s : sc.nextLine().split(",")) {
            coins.add(Integer.parseInt(s.trim()));
        }

        int value = sc.nextInt();

        System.out.println(countChange(coins, value));
    }
}
