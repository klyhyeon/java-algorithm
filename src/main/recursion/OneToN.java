package recursion;

import java.util.Scanner;

public class OneToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOneToN(n);
    }

    public static void printOneToN(int n) {
        if (n == 0) {
            return;
        }
        printOneToN(n - 1);
        System.out.print(n + " ");
    }
}
