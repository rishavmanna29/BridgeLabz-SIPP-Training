import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns];

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

       
        int[] array2 = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array2[index++] = arr[i][j];
            }
        }

        
        System.out.println("1D array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        input.close();
    }
}
