import java.util.*;
class PrintArrayRecursive {
    public static void printArray(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4};
        System.out.print("Array elements: ");
        printArray(arr, 0);
    }
}