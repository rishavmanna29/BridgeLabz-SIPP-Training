import java.util.Stack;

public class SortStackRecursive {

    // Function to sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);              // Sort remaining stack
            insertInSortedOrder(stack, top); // Insert top in correct position
        }
    }

    // Helper function to insert an element in sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
        } else {
            int top = stack.pop();
            insertInSortedOrder(stack, value);
            stack.push(top); // Put back the popped element
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
