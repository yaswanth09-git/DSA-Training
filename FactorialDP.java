import java.util.HashMap;
import java.util.Scanner;

public class FactorialDP {
    static HashMap<Integer, Long> memo = new HashMap<>();
    public static long factorial(int n) {
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        if(n <= 1) {
            return 1;
        }
        long result = n * factorial(n - 1);
        memo.put(n, result);
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Factorial is not defined for negative numbers. ");
        }else {
            System.out.println("Factorial of " + n + "is: " + factorial(n));
        }
        sc.close();
    }
 }