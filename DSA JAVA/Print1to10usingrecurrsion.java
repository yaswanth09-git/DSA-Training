import java.util.*;
public class Print1to10usingrecurrsion{
    public static void main(String args[]) {
        printNumbers(1);
    }
    static void printNumbers(int num) {
        if (num > 10) {
            return;
        }
        System.out.println(num);
        printNumbers(num + 1);
    }
}