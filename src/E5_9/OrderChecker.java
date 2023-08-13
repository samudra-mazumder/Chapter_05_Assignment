package E5_9;

import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3))
            System.out.println("In order");
        else
            System.out.println("Not in order");
    }
}
