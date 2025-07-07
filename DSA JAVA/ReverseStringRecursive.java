import java.util.Scanner;
class ReverseStringRecursive {
    public static String reverse(String str) {
        if (str.equals("")|| str.length() == 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        String reversed = reverse(input);
        System.out.println("Reverse string: " + reversed);
        scanner.close();
    }
}