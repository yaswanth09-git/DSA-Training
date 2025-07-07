import java.util.Scanner;
class CountUp {
    static void countUp (int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        countUp(current + 1, n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Counting up to " + n + ":");
        countUp(0, n);
        scanner.close();
    }
}
