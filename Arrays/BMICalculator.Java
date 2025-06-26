import java.util.*;

public class BMICalci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("  Height (in meters): ");
            height[i] = input.nextDouble();
            System.out.print("  Weight (in kilograms): ");
            weight[i] = input.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Height: " + height[i] + " m");
            System.out.println("  Weight: " + weight[i] + " kg");
            System.out.printf("  BMI: %.2f\n", bmi[i]);
            System.out.println("  Status: " + status[i]);
            System.out.println();
        }
    }
}
