import java.util.Scanner;
class Countdown {
    public static void countDown(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n+ " ");
        countDown(n - 1);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        System.out.print("Countdown: ");
        countDown(N);
        scanner.close();
    }
}