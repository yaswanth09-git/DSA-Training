import java.util.*;
class customstack {
    int[] arr;
    int top;
    int capacity;

    Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }
}