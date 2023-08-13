package E5_7;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        System.out.print("Enter three numbers:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1 < num2 && num2 < num3)
            System.out.println("increasing");
        else if (num1 > num2 && num2 > num3)
            System.out.println("decreasing");
        else
            System.out.println("neither");
    }
}

