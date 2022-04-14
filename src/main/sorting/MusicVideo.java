package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int musicTotal = in.nextInt();
        int dvdCountTotal = in.nextInt();
        int[] allMusics = new int[musicTotal];
        int dvdSumTotal = 0;
        for (int i = 0; i < musicTotal; i++) {
            allMusics[i] = in.nextInt();
        }


//        Arrays.sort(allMusics);

        int mininumDvdTotal = Arrays.stream(allMusics).max().getAsInt();
        int maximumDvdTotal = Arrays.stream(allMusics).sum();
        int answer = 0;
        while (mininumDvdTotal <= maximumDvdTotal) {
            int target = (maximumDvdTotal + mininumDvdTotal) / 2;

            int dvdCount = 1;
            int musicSum = 0;
            for (int x : allMusics) {
                if (musicSum + x > target) {
                    dvdCount++;
                    musicSum = x;
                } else {
                    musicSum += x;
                }
            }

            if (dvdCount <= dvdCountTotal) {
                answer = target;
                maximumDvdTotal = target - 1;
            } else {
                mininumDvdTotal = target + 1;
            }
        }
        System.out.println(answer);
    }
}
