package sorting;

import java.util.*;

public class Coordinate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int coordinateTotal = in.nextInt();
        int loop = 0;
        int[] oneDimensionArray = new int[coordinateTotal];
        int[][] coordinateArray = new int[coordinateTotal][2];
        //강의 풀이방식
        List<Point> allPoints = new ArrayList<>();
        for (int i = 0; i < coordinateTotal; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            allPoints.add(new Point(x, y));
        }

        Collections.sort(allPoints);

        for (Point p : allPoints) {
            System.out.println(p.x + " " + p.y);
        }

//        while (loop < coordinateTotal) {
//            for (int i = 0; i < 2; i++) {
//                coordinateArray[loop][i] = in.nextInt();
//            }
//            loop++;
//        }
//
        Arrays.sort(oneDimensionArray);
        //1열로만 비교
        Arrays.sort(coordinateArray, Comparator.comparingInt(o1 -> o1[0]));
        //1열, 2열 모두 비교
        Arrays.sort(coordinateArray, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });


//        int swapIndex = 0;
//        for (int i = 0; i < coordinateTotal; i++) {
//            int key = i;
//            for (int j = i + 1; j < coordinateTotal; j++) {
//                if (key > coordinateArray[i + 1][0]) {
//                    key = coordinateArray[i + 1][0];
//                    swapIndex = i;
//                }
//            }
//        }
//        for (int i = 0; i < coordinateTotal; i++) {
//            System.out.println(coordinateArray[i][0] + " " + coordinateArray[i][1]);
//        }
    }
}

class Point implements Comparable<Point> {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}
