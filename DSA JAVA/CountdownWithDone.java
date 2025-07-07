import java.util.Scanner;
class CountdownWithDone {
    static void countDown(int n) {
        if (n == 0) {
            System.out.println("Done");
            return; 
        }
        System.out.println(n);
        countDown(n - 1);   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count down from: ");
        int n = sc.nextInt();
        countDown(n);
        sc.close();
    }   
}