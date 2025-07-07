import java.util.Scanner;
class MultiplicationTable {
    static void printTable(int number, int multiplier, int n) {
        if (multiplier > n) {
            return;
        }
        System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
        printTable(number, multiplier + 1, n); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which you want the multiplication table: ");
        int number = scanner.nextInt();
        System.out.print("Enter the range (n): ");
        int n = scanner.nextInt();
        printTable(number, 1, n);
        scanner.close();
    }
}