package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {

    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner in = new Scanner(System.in);
        int totalNumber = in.nextInt();
        int[] numbersArr = new int[totalNumber];
        for (int i = 0; i < totalNumber; i++) {
            numbersArr[i] = in.nextInt();
        }
        //스왑이 없으면 true
        boolean noSwap = true;
        for (int i = 0; i < totalNumber; i++) {
            for (int j = 0; j < totalNumber - 1; j++) {
                if (numbersArr[j] > numbersArr[j+1]) {
                    noSwap = false;
                    int temp = numbersArr[j];
                    numbersArr[j] = numbersArr[j+1];
                    numbersArr[j+1] = temp;
                }
            }
            if (noSwap) {
                break;
            }
        }
        Arrays.stream(numbersArr).forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
