import java.util.Scanner;
class SumOfNNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();
        int result = sum(n);
        System.out.println("Sum of first " + n + " numbers is: " + result);
        scanner.close();
    }
    static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}