import java.util.*;
class checkprimenumber{
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int num = 17;
        boolean result = isPrime(num);
        System.out.println(num + " is prime? " + result);
    }
}