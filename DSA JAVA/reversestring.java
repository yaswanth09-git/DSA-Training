import java.util.*;
class reversestring{
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String args[]) {
        String input = "hello";
        String result = reverseString(input);
        System.out.println("Reversed string is: " + result);
    }
}