package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorting {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalNumber = in.nextInt();
        int[] numbers = new int[totalNumber];
        for(int i = 0; i < totalNumber; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i = 1; i < totalNumber; i++) {
            int idx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[idx] < numbers[j]) {
                    int tmp = numbers[idx];
                    numbers[idx] = numbers[j];
                    numbers[j] = tmp;
                    idx--;
                } else {
                    break;
                }
            }
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
