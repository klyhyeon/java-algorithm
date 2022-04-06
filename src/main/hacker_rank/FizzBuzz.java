package hacker_rank;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n + 1; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
        }
    }
}
