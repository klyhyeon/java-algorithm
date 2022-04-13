package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Mischief {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int studentsTotal = in.nextInt();
        int[] studentsHeights = new int[studentsTotal];
        int[] meAndPartner = new int[2];
        int loop = 0;
        while (loop < studentsTotal) {
            studentsHeights[loop] = in.nextInt();
            loop++;
        }

        int[] studentsHeightsSorted = Arrays.stream(studentsHeights).sorted().toArray();

        int count = 0;
        for (int i = 0; i < studentsTotal; i++) {
            if (count <= 1 && studentsHeights[i] != studentsHeightsSorted[i]) {
                meAndPartner[count++] = i + 1;
            }
        }


        //나
//        for (int i = 0; i < studentsTotal - 1; i++) {
//            if (studentsHeights[i] >= studentsHeights[i+1]) {
//                meAndPartner[0] = i + 1;
//                break;
//            }
//        }
//
//        //친구
//        for (int i = studentsTotal - 1; i > 0; i--) {
//            if (studentsHeights[i] <= studentsHeights[i-1]) {
//                meAndPartner[1] = i + 1;
//                break;
//            }
//        }

//        boolean findMeFlag = true;
//        for (int i = 0; i < studentsTotal - 1; i++) {
//            if (findMeFlag && studentsHeights[i] > studentsHeights[i+1]) {
//                findMeFlag = false;
//                meAndPartner[0] = i;
//            }
//
//            if (i != 0 && studentsHeights[i] < studentsHeights[i-1] && studentsHeights[i] < studentsHeights[i+1]) {
//                meAndPartner[1] = i;
//                break;
//            }
//        }
//
        for (int ele : meAndPartner) {
            System.out.print(ele + " ");
        }
    }
}
