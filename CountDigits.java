import java.util.Scanner;
class CountDigits {
    static int countDigits(int n) {
        if (n == 0) 
        return 0;
        return 1 + countDigits(n / 10);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if(n == 0) {
            System.out.println("Total digits: 1");
        }else {
            int result = countDigits(Math.abs(n));
            System.out.println("Total digits: " + result);
        }
        scanner.close();
    }
}