package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorting {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalNumber = in.nextInt();
        int[] numbers = new int[totalNumber];
        for (int i = 0; i < totalNumber; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i = 1; i < totalNumber; i++) {
            int key = numbers[i];
            /* while문으로 리팩토링 */
//            for (int j = i - 1; j >= 0; j--) {
//                if (key < numbers[j]) {
//                    numbers[j + 1] = numbers[j];
//                } else {
//                    numbers[j + 1] = key;
//                    break;
//                }
//                if (j == 0) {
//                    numbers[j] = key;
//                }
//            }
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        Arrays.stream(numbers).forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
