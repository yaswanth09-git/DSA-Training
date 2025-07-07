import java.util.Scanner;
class PrintAscending {
    public static void printNumbers(int i, int N) {
        if (i > N) {
            return;
        }
        System.out.print(i + " ");
        printNumbers(i + 1, N);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        System.out.print("Output: ");
        printNumbers(1, N);
        scanner.close();
    }
}