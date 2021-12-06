package sorting;

import java.util.*;

public class SelectionSorting01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int totalNumber = in.nextInt();
        int[] numbers = new int[totalNumber];
        for(int i = 0; i < totalNumber; i++) {
            numbers[i] = in.nextInt();
        }
        Arrays.stream(numbers).forEach(System.out::println);
//        for (int i = 0; i < totalNumber - 1; i++) {
//            int idx = i;
//            for (int j = i + 1; j < totalNumber - 1; j++) {
//                if (numbers[j] < numbers[idx]) {
//                    idx = j;
//                }
//            }
//            int tempValue = numbers[i];
//            numbers[i] = numbers[idx];
//            numbers[idx] = tempValue;
//        }
//        Arrays.stream(numbers).forEach(System.out::println);
    }
}
