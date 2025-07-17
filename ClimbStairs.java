import java.util.*;
class ClimbStairs {
    public static int countWays(int n) {
        if(n == 0 || n == 1)
        return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String args[]) {
        int n = 3;
        System.out.println("Number of ways to climb " + n + " stairs: " + countWays(n));
    }
}