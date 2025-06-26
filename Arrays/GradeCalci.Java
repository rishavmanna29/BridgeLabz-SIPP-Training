import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    if (j == 0) System.out.print("  Physics: ");
                    else if (j == 1) System.out.print("  Chemistry: ");
                    else System.out.print("  Maths: ");
                    
                    mark = input.nextInt();
                    if (mark < 0) System.out.println("  Marks cannot be negative. Please re-enter.");
                } while (mark < 0);
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = total / 3.0;
            percentages[i] = percentage;

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics = " + marks[i][0] + ", Chemistry = " + marks[i][1] + ", Maths = " + marks[i][2]);
            System.out.println("  Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("  Grade: " + grades[i]);
        }
    }
}
