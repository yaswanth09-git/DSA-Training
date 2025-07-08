import java.util.*;
class TowerOfHanoi {
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return; 
        }
        solveHanoi(n - 1, source, destination, auxiliary);  
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        solveHanoi(n - 1, auxiliary, source, destination);
    }
    public static void main(String args[]) {
        int numberOfDisks = 2;
        System.out.println("Tower of Hanoi with " + numberOfDisks + " disks:\n");
        solveHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}