package sorting;

import java.util.*;

public class DecisionAlgorithm2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stallTotal = in.nextInt();
        int horseTotal = in.nextInt();
        int[] stallLocations = new int[stallTotal];
        for (int i = 0; i < stallTotal; i++) {
            stallLocations[i] = in.nextInt();
        }

        Arrays.sort(stallLocations);

        int lt = 1;
        int rt = stallLocations[stallTotal - 1];
        int target = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int currentMidMaxHorseCount = count(mid, stallLocations);
            if (horseTotal <= currentMidMaxHorseCount) {
                target = mid;
                lt = mid + 1;
                continue;
            }
            rt = mid - 1;
        }

        System.out.println(target);
    }

    public static int count(int targetDistance, int[] stallLocations) {
        int count = 1;
        int previousLocation = stallLocations[0];

        for (int stall : stallLocations) {
            int distance = stall - previousLocation;
            if (distance >= targetDistance) {
                previousLocation = stall;
                count++;
            }
        }

        return count;
    }
}
