package E5_5;

import java.util.Scanner;

public class HalfWordComparator {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int midLen = string.length()/2 ;
        String firstHalf = string.substring(0,midLen-1);
        if(string.length() %2!=0)
            midLen++;
        String lastHalf = string.substring(midLen,string.length()-1);
        if(firstHalf.equals(lastHalf))
            System.out.println("First and last half same");
        else
            System.out.println("First and last half different");
    }
}
