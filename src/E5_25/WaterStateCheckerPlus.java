package E5_25;

import java.util.Scanner;

public class WaterStateCheckerPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the altitude: ");
        double altitude = scanner.nextDouble();

        System.out.print("Enter 'M' for meters or 'F' for feet: ");
        char unit = scanner.next().charAt(0);

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