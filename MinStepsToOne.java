import java.util.HashMap;
import java.util.Scanner;
class MinStepsToOne {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    static int minSteps(int n) {
        if(n == 1) return 0;
        if(memo.containsKey(n)) return memo.get(n);
        int steps = 1 + minSteps(n - 1);
        if(n % 2 == 0)
        steps = Math.min(steps, 1 + minSteps(n / 2));
        if(n % 3 == 0)
        steps = Math.min(steps, 1 + minSteps(n / 3));

        memo.put(n, steps);
        return steps;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter number n: ");
        int n = scanner.nextInt();
        int result = minSteps(n);
        System.out.println("Minimum steps to reach 1: " + result);
        scanner.close();
    }
}