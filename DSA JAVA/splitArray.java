import java.util.*;
class splitArray {
    public static void main (String args[]) {
        int [] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int middle = a.length / 2;
        System.out.println("array: " + Arrays.toString(a));
        System.out.print("first half: ");
        show(a, 0, middle - 1);
        System.out.print("\nsecond half: ");
        show(a, middle, a.length - 1);
    }
    static void show(int[] a, int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(a[start] + " ");
        show(a, start + 1, end);
    }
}