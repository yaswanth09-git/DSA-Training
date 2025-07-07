import java.util.Scanner;
class SumOfDigits {
    public static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumDigits(num / 10);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = sumDigits(number);
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}