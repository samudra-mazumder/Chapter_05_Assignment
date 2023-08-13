package E5_13;
import java.util.Scanner;

class Grade {
    public static double getNumericGrade(String letterGrade) {
        double numericGrade = 0.0;

        switch (letterGrade) {
            case "A+":
                numericGrade = 4.0;
                break;
            case "A":
                numericGrade = 4.0;
                break;
            case "A-":
                numericGrade = 3.7;
                break;
            case "B+":
                numericGrade = 3.3;
                break;
            case "B":
                numericGrade = 3.0;
                break;
            case "B-":
                numericGrade = 2.7;
                break;
            case "C+":
                numericGrade = 2.3;
                break;
            case "C":
                numericGrade = 2.0;
                break;
            case "C-":
                numericGrade = 1.7;
                break;
            case "D":
                numericGrade = 1.0;
                break;
            case "F":
                numericGrade = 0.0;
                break;
            default:
                System.out.println("Invalid letter grade.");
                break;
        }

        return numericGrade;
    }
}

public class GradeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letterGrade = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitivity

        double numericGrade = Grade.getNumericGrade(letterGrade);

        if (numericGrade != 0.0) {
            System.out.println("The numeric value is " + numericGrade + ".");
        }

        scanner.close();
    }
}



