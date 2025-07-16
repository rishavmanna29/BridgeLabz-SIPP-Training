import java.util.*;

public class SortComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int n = 10000;
        Random rand = new Random();
        int[] data1 = new int[n];
        int[] data2 = new int[n];
        int[] data3 = new int[n];
        for (int i = 0; i < n; i++) {
            int val = rand.nextInt(n * 10);
            data1[i] = data2[i] = data3[i] = val;
        }

        long start = System.currentTimeMillis();
        bubbleSort(data1);
        long end = System.currentTimeMillis();
        System.out.println("Bubble Sort: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        Arrays.sort(data2); // Dual-pivot QuickSort
        end = System.currentTimeMillis();
        System.out.println("Quick Sort (Arrays.sort): " + (end - start) + " ms");

        start = System.currentTimeMillis();
        Arrays.parallelSort(data3); // Parallel Merge Sort
        end = System.currentTimeMillis();
        System.out.println("Merge Sort (Arrays.parallelSort): " + (end - start) + " ms");
    }
}
