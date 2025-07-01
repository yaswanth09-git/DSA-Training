import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop element
        System.out.println("Popped: " + stack.pop());  // 30

        // Peek at top element
        System.out.println("Top element: " + stack.peek());  // 20

        // Check if stack is empty
        System.out.println("Is empty? " + stack.isEmpty());  // false

        // Stack size
        System.out.println("Size: " + stack.size());  // 2
    }
}