package programmers.main;

import programmers.hash.Clothes;

public class Main {

    public static void main(String[] args) {
        Clothes clothes = new Clothes();
        System.out.println(clothes.solution(
                new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}})
        );
    }
}
