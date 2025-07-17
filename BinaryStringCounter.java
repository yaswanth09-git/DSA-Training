import java.util.Scanner;
class BinaryStringCounter {
    static int countBinaryStrings(int n) {
        if(n == 0) return 0;
        if(n == 1) return 2;
        if(n == 2) return 3;
        int[] dp = new int[n + 1];

        dp[1] = 2;
        dp[2] = 3;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of binary string (n): ");
        int n = scanner.nextInt();
        int result = countBinaryStrings(n);
        System.out.println("Count of " + n + "-length binary strings with no consecutive 1s: " + result);
        scanner.close();
    }
}