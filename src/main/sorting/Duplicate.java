package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int studentsTotal = in.nextInt();
        int[] numbers = new int[studentsTotal];
        HashMap<Integer, Object> numbersHashMap = new HashMap<>();
        int loop = 0;
        String answer = "U";
        while (loop < studentsTotal) {
            numbers[loop] = in.nextInt();
//            int currentNumber = in.nextInt();
//            if (numbersHashMap.put(currentNumber, currentNumber) != null) {
//                answer = "D";
//            }
            loop++;
        }

        Arrays.sort(numbers);
//        outer:
        for (int i = 0; i < studentsTotal - 1; i++) {
//            int currentNumber = numbers[i];
//            for (int j = i + 1; j < studentsTotal; j++) {
//                if (currentNumber == numbers[j]) {
//                    answer = "D";
//                    break outer;
//                }
//            }
            if (numbers[i] == numbers[i+1]) {
                answer = "D";
                break;
            }
        }
        System.out.println(answer);
    }
}
