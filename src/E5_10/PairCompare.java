package E5_10;

import java.util.Scanner;

public class PairCompare {
    public static void main(String[] args) {
        System.out.println("Enter four inergers : ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        if((num1 == num2 && num3 == num4) || (num1 == num3 && num2 == num4) || (num1 == num4 && num2 == num3))
            System.out.print("two pairs");
        else
            System.out.print("not two pairs");
    }
}
