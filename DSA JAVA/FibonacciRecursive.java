import java.util.Scanner;
class FibonacciRecursive{
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        scanner.close();
        }
    }