import java.util.Scanner;
class FactorialRecursive {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N to calculate N!: ");
        int N = scanner.nextInt();
        int result = factorial(N);
        System.out.println("Factorial of " + N + " is: " + result);
        scanner.close();
    }
}