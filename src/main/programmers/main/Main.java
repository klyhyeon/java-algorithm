package programmers.main;

import programmers.exhaustive_search.Carpet;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Carpet carpet = new Carpet();
    Arrays.stream(carpet.solution(24, 24)).forEach((a) -> {
        System.out.println(a);
    }); //4,4
  }
}
