import java.util.*;
class RunningSum {
    public static void printNumbers(int i, int n, int sum ) {
        if (i > n) {
            return;
        }
        sum = sum + i;
        System.out.println(i + " (sum: "+ sum + ")");
        printNumbers(i + 1, n, sum);
    }
        public static void main(String args[]) {
        int n = 4; 
        printNumbers(1, n, 0);
    }
}