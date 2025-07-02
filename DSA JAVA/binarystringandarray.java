import java.util.*;
class binarystringandarray{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary String: " + binaryString);

        int[] binaryArray = new int[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            binaryArray[i] = binaryString.charAt(i) - '0';
        }
        System.out.print("Binary Array: ");
        for (int bit : binaryArray) {
            System.out.print(bit + " ");
        }
    }
}