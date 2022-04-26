package recursion;

public class TailRecursion {

    static int fact(int a) {
        if (a == 0) {
            return 1;
        }
        return a * fact(a - 1);
    }

    static int factTR(int a, int b) {
        if (a == 0) {
            return b;
        }
        return factTR(a - 1, a * b);
    }

    static int factWrap(int a) {
        return factTR(a, 1);
    }

    public static void main(String[] args) {
//        System.out.println(fact(3));
        System.out.println(factWrap(5));
    }
}
