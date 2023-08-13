package E5_3;

import java.util.Scanner;

public class DigitCounter{
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number < 0)
            number = - number;
        int digitCounter = 1;
        int tempNumber = number;
        while(tempNumber >= 10){
            tempNumber = tempNumber / 10;
            digitCounter++;
        }
        System.out.println("Number of digits = " +digitCounter);
    }
}