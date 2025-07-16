import java.util.*;

public class SearchDataStructures {
    public static void main(String[] args) {
        int n = 1_000_000;
        int[] arr = new int[n];
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int val = rand.nextInt(n * 10);
            arr[i] = val;
            hashSet.add(val);
            treeSet.add(val);
        }

        int target = arr[n / 2];

        long start = System.currentTimeMillis();
        for (int i : arr) {
            if (i == target) break;
        }
        long end = System.currentTimeMillis();
        System.out.println("Array Search: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        hashSet.contains(target);
        end = System.currentTimeMillis();
        System.out.println("HashSet Search: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        treeSet.contains(target);
        end = System.currentTimeMillis();
        System.out.println("TreeSet Search: " + (end - start) + " ms");
    }
}
