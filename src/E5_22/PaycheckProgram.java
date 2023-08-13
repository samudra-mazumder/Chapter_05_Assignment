package E5_22;

import java.util.Scanner;

class Paycheck {
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;

    public Paycheck(String employeeName, double hourlyWage, double hoursWorked) {
        this.employeeName = employeeName;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        double regularPay = hoursWorked <= 40 ? hoursWorked * hourlyWage : 40 * hourlyWage;
        double overtimePay = hoursWorked > 40 ? (hoursWorked - 40) * hourlyWage * 1.5 : 0;
        return regularPay + overtimePay;
    }

    public void printPaycheck() {
        double pay = calculatePay();
        System.out.println("Paycheck for " + employeeName);
        System.out.println("Regular hours worked: " + (hoursWorked <= 40 ? hoursWorked : 40));
        System.out.println("Overtime hours worked: " + (hoursWorked > 40 ? hoursWorked - 40 : 0));
        System.out.println("Hourly wage: $" + hourlyWage);
        System.out.println("Total pay: $" + pay);
    }
}

public class PaycheckProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = scanner.nextDouble();

        Paycheck paycheck = new Paycheck(employeeName, hourlyWage, hoursWorked);
        paycheck.printPaycheck();

        scanner.close();
    }
}
