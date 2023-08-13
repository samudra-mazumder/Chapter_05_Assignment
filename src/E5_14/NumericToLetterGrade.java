package E5_14;

import java.util.Scanner;

public class NumericToLetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric value between 0 and 4 :");
        double numericValue = scanner.nextDouble();
        if (numericValue < 0 || numericValue > 4)
            System.out.println("Invalid numeric value. Please enter a value between 0 and 4");
        else {
            String letterGrade = Grade.getLetterGrade(numericValue);
            System.out.println("The letter grade is " + letterGrade + ".");
        }
        scanner.close();
    }
        class  Grade{
        public static String getLetterGrade(double numericValue){
           if(numericValue >= 4.0){
               return "A+";
           } else if(numericValue >= 3.85){
               return "A";
           } else if(numericValue >= 3.5){
               return "A-";
           } else if(numericValue >= 3.15){
               return "B+";
           } else if (numericValue >= 2.85) {
               return "B";
           } else if (numericValue >= 2.5) {
               return "B-";
           } else if (numericValue >= 2.15) {
               return "C+";
           } else if (numericValue >= 1.85) {
               return "C";
           } else if (numericValue >= 1.5) {
               return "C-";
           } else if (numericValue >= 1.15) {
               return "D";
           } else {
               return "F";
           }

        }
    }
}
