import java.util.HashMap;
public class FibonacciDP {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int fibonacci(int n) {
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        if(n <= 1) {
            return n;
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}