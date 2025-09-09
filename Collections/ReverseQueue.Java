import java.util.*;

public class ReverseQueue {
    public static <T> void reverse(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(10, 20, 30));
        reverse(q);
        System.out.println(q); // [30, 20, 10]
    }
}
