package test.patona;

public class Pitago {

    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static int solution(int b) {
        int a = b - 1;
        int c = 1;
        int bSquare = b * b;
        int cSquare = 0;
        //bSquare = cSquare - aSquare
        
        boolean flag = true;
        while(flag) {
            int sum = (a * a) + (b * b);
            if (cSquare == sum) {
                flag = false;
            }
            c++;
            if (c > b) {
                c = -1;
                flag = false;
            }
        }
        return c;
    }
}
