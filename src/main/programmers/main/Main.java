package programmers.main;

import programmers.exhaustive_search.MinimumRectangle;

public class Main {

    public static void main(String[] args) {
        MinimumRectangle minimumRectangle = new MinimumRectangle();
        System.out.println(minimumRectangle.solution(
                //[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]
                new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}})
        );
    }
}
