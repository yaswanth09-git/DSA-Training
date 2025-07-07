import java.util.*;
class StringLengthRecursive {
    public static int findLength(String str) {
        if(str.equals("")) {
            return 0;
        }
        return 1 + findLength(str.substring(1));
    }
    public static void main(String args[]) {
        String input = "yaswanth peddakonda";
        int length = findLength(input);
        System.out.println("Length of \"" + input + "\" is: " + length);
    }
}