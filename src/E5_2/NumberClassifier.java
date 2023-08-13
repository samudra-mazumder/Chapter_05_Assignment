package E5_2;

import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        System.out.println("Enter any floating  point number: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        if(number == 0)
        {
            System.out.println("Zero");
        }
        else if (number > 0) {
            System.out.print("Positive");
        }
        else
            System.out.print("Negative");
        double absoluteValue = Math.abs(number);
        if(absoluteValue < 1)
            System.out.print("small");
        if(absoluteValue > 1000000)
            System.out.print("large");
    }
}
