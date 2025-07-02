import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek()); 
        System.out.println("Is empty? " + stack.isEmpty()); 
        System.out.println("Size: " + stack.size()); 
    }
}
