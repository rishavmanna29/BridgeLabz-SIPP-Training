import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int maths = scanner.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        String grade = "";
        String remark = "";

        if (percentage >= 80) {
            grade = "A";
            remark = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remark = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remark = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remark = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remark = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remark = "Remedial standards";
        }

        System.out.println("Average Mark: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);
    }
}
