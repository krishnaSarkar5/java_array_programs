package Recursion;

public class x_nRecursion {

    public static int powerN(int x, int n) {

        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        else {
            int m = x * powerN(x, n - 1);
            return m;
        }
    }

    public static void main(String[] args) {
        System.out.println(powerN(0,5));
    }
}
