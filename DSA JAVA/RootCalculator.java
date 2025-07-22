import java.util.Scanner;
class RootCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its roots: ");
        double number = scanner.nextDouble();
        if(number < 0) {
            System.out.println("Square root of negative numbers is not real (use complex numbers).");
        }else {
            double squareRoot = Math.sqrt(number);
            System.out.printf("Square root of %.2f is %.4f%n", number, squareRoot);
        }
        double cubeRoot = Math.cbrt(number);
        System.out.printf("Cube root of %.2f is %.4f%n", number, cubeRoot);
        scanner.close();
    }
}