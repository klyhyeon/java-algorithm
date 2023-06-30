package programmers;

public class Main {

  public static void main(String[] args) {
    Booked booked = new Booked();
    System.out.println(booked.solution(new String[][]{{"09:55", "hae"}, {"10:05", "jee"}},	new String[][]{{"10:04", "hee"}, {"14:07", "eom"}}));
  }
}
