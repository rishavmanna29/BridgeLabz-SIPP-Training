public class CountingSortStudentAges {
    public static void main(String[] args) {
        int[] ages = {12, 15, 13, 10, 12, 18, 11, 10};
        int minAge = 10;
        int maxAge = 18;
        int[] count = new int[maxAge - minAge + 1];

        // Count frequency
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Fill sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ages[index++] = i + minAge;
                count[i]--;
            }
        }

        System.out.println("Sorted Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
