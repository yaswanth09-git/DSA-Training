import java.util.HashMap;
import java.util.Scanner;
class PowerCalculator {
    static HashMap<String, Double> memo = new HashMap<>();
    static double power(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        String key = x + "^" + n;
        if(memo.containsKey(key)) {
            return memo.get(key);
        }
        double result;
        if(n % 2 == 0) {
            result = power(x, n / 2);
            result = result * result;
        } else {
            result = x * power(x, n - 1);
        }
        memo.put(key, result);
        return result;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        double result = power(x, n);
        System.out.println(x + " raised to the power "  + n + "is: " + result);
        scanner.close();
    }
}