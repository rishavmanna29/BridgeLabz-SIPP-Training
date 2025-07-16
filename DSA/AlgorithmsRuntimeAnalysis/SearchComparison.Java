import java.util.*;

public class SearchComparison {
    public static boolean linearSearch(int[] arr, int target) {
        for (int val : arr) {
            if (val == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] data = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) data[i] = rand.nextInt(n * 10);
        int target = data[rand.nextInt(n)];

        long start = System.currentTimeMillis();
        linearSearch(data, target);
        long end = System.currentTimeMillis();
        System.out.println("Linear Search Time: " + (end - start) + " ms");

        Arrays.sort(data);
        start = System.currentTimeMillis();
        binarySearch(data, target);
        end = System.currentTimeMillis();
        System.out.println("Binary Search Time (after sort): " + (end - start) + " ms");
    }
}
