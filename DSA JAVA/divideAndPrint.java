import java.util.Scanner;
class DivideAndPrint {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Dividing sequence:");
        divideAndPrint(num);
    }
    static void divideAndPrint(int num) {
        System.out.print(num);
        if(num == 0) {
            return;
        }
        System.out.print(" -> ");
        divideAndPrint(num / 2);
    }
}