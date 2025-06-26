import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();
        double heightCm = scanner.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        if (bmi <= 18.4) {
            System.out.println("Underweight");
        }

        else if (bmi <= 24.9) {
            System.out.println("Normal");
        }

        else if (bmi <= 39.9) {
            System.out.println("Overweight");
        }

        else {
            System.out.println("Obese");
        }

        scanner.close();
    }
}
