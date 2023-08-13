package E5_24;

import java.util.Scanner;

public class WaterStateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit (C for Celsius or F for Fahrenheit): ");
        char unit = scanner.next().charAt(0);

        if (unit == 'C' || unit == 'c') {
            checkWaterStateCelsius(temperature);
        } else if (unit == 'F' || unit == 'f') {
            checkWaterStateFahrenheit(temperature);
        } else {
            System.out.println("Invalid unit entered. Please enter C or F.");
        }

        scanner.close();
    }

    public static void checkWaterStateCelsius(double temperatureC) {
        if (temperatureC <= 0) {
            System.out.println("Water is solid (ice) at " + temperatureC + "°C.");
        } else if (temperatureC >= 100) {
            System.out.println("Water is gaseous (steam) at " + temperatureC + "°C.");
        } else {
            System.out.println("Water is liquid at " + temperatureC + "°C.");
        }
    }

    public static void checkWaterStateFahrenheit(double temperatureF) {
        double temperatureC = (temperatureF - 32) * 5 / 9; // Convert Fahrenheit to Celsius
        checkWaterStateCelsius(temperatureC);
    }
}
