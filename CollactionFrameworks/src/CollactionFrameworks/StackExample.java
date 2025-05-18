package CollactionFrameworks;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Add items (push)
        stack.push("Plate 1");
        stack.push("Plate 2");
        stack.push("Plate 3");

        System.out.println("Top item: " + stack.peek()); // Plate 3

        // Remove top item (pop)
        System.out.println("Removed: " + stack.pop());  // Plate 3

        System.out.println("Now top: " + stack.peek()); // Plate 2
    }	
}
