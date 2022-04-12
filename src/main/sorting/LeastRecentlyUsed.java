package sorting;

import java.util.Scanner;

public class LeastRecentlyUsed {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = in.nextInt();
        int totalInput = in.nextInt();
        int[] allInputs = new int[totalInput];
        for (int i = 0; i < totalInput; i++) {
            allInputs[i] = in.nextInt();
        }

        int[] cacheArray = new int[capacity];
        cacheArray[0] = allInputs[0];
        for (int i = 1; i < totalInput; i++) {
            int sameJobPoint = -1;
            int currentInput = allInputs[i];
            for (int j = capacity - 1; j > 0; j--) {
                if (cacheArray[j] == currentInput) {
                    sameJobPoint = j;
                    break;
                }
            }
            if (sameJobPoint == -1) {
                for (int j = capacity - 1; j > 0; j--) {
                    cacheArray[j] = cacheArray[j - 1];
                }
            } else {
                for (int j = sameJobPoint; j > 0; j--) {
                    cacheArray[j] = cacheArray[j - 1];
                }
            }
            cacheArray[0] = currentInput;
        }

        for (int cache : cacheArray) {
            System.out.print(cache + " ");
        }
    }
}
