package recursion;

import java.util.Scanner;

public class Fibonacci {

    static int[] savedNumbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        savedNumbers = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            System.out.print(fibo(i, savedNumbers) + " ");
        }
    }

    public static int fibo(int n, int[] savedNumbers) {

        if (savedNumbers[n] > 0) {
            return n;
        }

        if (n == 1 || n == 2) {
            return savedNumbers[n] = 1;
        }

        savedNumbers[n] = fibo(n - 1, savedNumbers) + fibo(n - 2, savedNumbers);
        return savedNumbers[n];
    }
}
