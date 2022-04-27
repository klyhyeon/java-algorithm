package recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(dfs(sc.nextInt()));
    }

    public static int dfs(int n) {
        if (n == 1) {
            return 1;
        }
        return n * dfs(n - 1);
    }
}
