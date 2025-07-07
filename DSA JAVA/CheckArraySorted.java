import java.util.Scanner;
class CheckArraySorted {
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean result = isSorted(arr, 0);
        if (result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
        scanner.close();
    }
}