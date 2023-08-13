package E5_4;

import java.util.Scanner;

public class FirstLastCharComparator {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String string = input.next();
        if(string.length() > 1)
        {
            char firstLetter = string.charAt(0);
            char lastLetter = string.charAt(string.length()-1);
            if(Character.toLowerCase(firstLetter) == Character.toLowerCase(lastLetter))
                System.out.println("First and last letters are same");
            else
                System.out.println("First and last letters are not same");
        }
        else
            System.out.println("This string is empty");
    }
}
