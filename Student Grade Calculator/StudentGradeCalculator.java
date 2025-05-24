import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMarks = 0;
        int subjects;

        System.out.print("Enter the number of subjects: ");
        subjects = scanner.nextInt();

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a number between 0 and 100.");
                i--; // Re-prompt for the same subject
            } else {
                totalMarks += marks;
            }
        }

        double average = totalMarks / subjects;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
