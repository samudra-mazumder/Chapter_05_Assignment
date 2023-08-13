package E5_1;

import java.util.Scanner;

public class IdentifyInteger {
    public static void main(String[] args) {
        System.out.println("Enter any integer number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num == 0)
            System.out.println("Zero");
        else if (num > 0) {
            System.out.println("Positive");
        }
        else
            System.out.println("Negative");
    }
}
