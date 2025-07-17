import java.util.HashMap;
import java.util.Scanner;

class SumOfNaturalNumbers {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    static int sum(int n) {
        if(n == 1) return 1;
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = n + sum(n - 1);
        memo.put(n, result);
        return result;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        if(n < 1) {
            System.out.println("Please enter a positive intger greater than 0.");
        }else {
            int result = sum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }
        scanner.close();
    }
}