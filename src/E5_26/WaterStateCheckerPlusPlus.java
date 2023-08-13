package E5_26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WaterStateCheckerPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altitude = 0.0;
        try {
            System.out.print("Enter the altitude: ");
            altitude = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value for altitude.");
            System.exit(1);
        }

        char unit = ' ';
        try {
            System.out.print("Enter 'M' for meters or 'F' for feet: ");
            unit = scanner.next().charAt(0);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter a valid unit (M or F).");
            System.exit(1);
        }

        scanner.close();

        if (unit == 'F' || unit == 'f') {
            altitude = feetToMeters(altitude);
        }

        double boilingPoint = 100 - (altitude / 300);

        String waterState;
        if (boilingPoint <= 0) {
            waterState = "solid";
        } else if (boilingPoint < 100) {
            waterState = "liquid";
        } else {
            waterState = "gaseous";
        }

        System.out.println("Water is in the " + waterState + " state at an altitude of " + altitude + " meters.");
        System.out.println("Adjusted boiling point of water: " + boilingPoint + " degrees Celsius.");
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }
}
