package sorting;

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNumber = in.nextInt();
        int targetNumber = in.nextInt();
        int[] allNumbers = new int[totalNumber];
        for (int i = 0; i < totalNumber; i++) {
            allNumbers[i] = in.nextInt();
        }
        //정렬
        Arrays.sort(allNumbers);
        //이분 검색으로 몇 번째인지 리턴
        int beginIdx = 0;
        int endIdx = totalNumber - 1;
        int middleIdx = totalNumber / 2;

        while (beginIdx <= endIdx) {
            if (targetNumber == allNumbers[middleIdx]) {
                break;
            }
            if (targetNumber > allNumbers[middleIdx]) {
                beginIdx = middleIdx + 1;
            } else {
                endIdx = middleIdx - 1;
            }
            middleIdx = (endIdx + beginIdx) / 2;
        }

        System.out.println(middleIdx + 1);
    }
}
