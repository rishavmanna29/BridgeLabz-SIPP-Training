import java.util.*;

public class SlidingWindowMax {

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>(); // Store indices

        for (int i = 0; i < nums.length; i++) {
            // Remove indices outside window
            if (!deque.isEmpty() && deque.peek() <= i - k)
                deque.poll();

            // Remove smaller elements from end
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();

            deque.offer(i);

            // Add max of window to result
            if (i >= k - 1)
                result.add(nums[deque.peek()]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(maxSlidingWindow(nums, k)); // [3, 3, 5, 5, 6, 7]
    }
}
