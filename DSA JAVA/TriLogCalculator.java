import java.util.Scanner;
class TriLogCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (in degrees for trigonometric functions): ");
        double degrees = scanner.nextDouble();
        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        double log10Value = Math.log10(degrees);
        double naturalLogValue = Math.log(degrees);
        System.out.println("Trigonometric Values:");
        System.out.printf("sin(%.2f°) = %.4f%n", degrees, sinValue);
        System.out.printf("cos(%.2f°) = %.4f%n", degrees, cosValue);
        System.out.printf("tan(%.2f°) = %.4f%n", degrees, tanValue);
        System.out.println("\nLogarithmic Values:");
        System.out.printf("log10(%.2f) = %.4f%n", degrees, log10Value);
        System.out.printf("ln(%.2f) = %.4f%n", degrees, naturalLogValue);
        scanner.close();
    }
}