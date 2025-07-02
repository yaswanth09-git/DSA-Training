import java.util.*;
class binarystringtointeger{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = sc.nextLine();
        int number = Integer.parseInt(binaryString, 2);
        System.out.println("Decimal Number: " + number);
    }
}