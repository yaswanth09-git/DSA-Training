import java.util.Scanner;
class callCounter {
    static void countCalls(int n, int callNumber) {
        if (callNumber > n) {
            return;
        }
        System.out.println("Call number: " + callNumber);
        countCalls(n, callNumber + 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times to call the function: ");
        int n = sc.nextInt();
        countCalls(n, 1);
        sc.close();
    }
}