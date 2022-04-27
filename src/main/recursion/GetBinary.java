package recursion;

import java.util.Scanner;

public class GetBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dfs(sc.nextInt());
    }

    public static void dfs(int n) {
        if (n == 0) {
            return;
        }
        dfs(n/2);
        System.out.print(n%2 + " ");
    }
}
