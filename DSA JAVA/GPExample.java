import java.util.*;
class GPExample {
    public static void main(String args[]) {
        int a = 3;
        int r = 2;
        int n = 4;
        int nthTerm = (int) (a * Math.pow(r, n - 1));
        System.out.println("The " + n + "th term of the GP is: " + nthTerm);
    }
}