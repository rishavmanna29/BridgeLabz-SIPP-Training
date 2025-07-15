public class HeapSortJobSalaries {
    public static void main(String[] args) {
        int[] salaries = {40000, 25000, 50000, 30000, 45000};

        // Selection Sort again
        for (int i = 0; i < salaries.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < salaries.length; j++) {
                if (salaries[j] < salaries[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = salaries[i];
            salaries[i] = salaries[minIndex];
            salaries[minIndex] = temp;
        }

        System.out.println("Sorted Salaries:");
        for (int sal : salaries) {
            System.out.print(sal + " ");
        }
    }
}
