package E5_23;

import java.util.Scanner;

public class CouponCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the cost of your groceries: $");
        double amountSpent = scanner.nextDouble();

        double couponValue = calculateCoupon(amountSpent);
        System.out.printf("You win a discount coupon of $%.2f. (%d%% of your purchase)%n", couponValue, getCouponPercentage(amountSpent));

        scanner.close();
    }

    public static double calculateCoupon(double amountSpent) {
        if (amountSpent < 10) {
            return 0;
        } else if (amountSpent <= 60) {
            return amountSpent * 0.08;
        } else if (amountSpent <= 150) {
            return amountSpent * 0.10;
        } else if (amountSpent <= 210) {
            return amountSpent * 0.12;
        } else {
            return amountSpent * 0.14;
        }
    }

    public static int getCouponPercentage(double amountSpent) {
        if (amountSpent < 10) {
            return 0;
        } else if (amountSpent <= 60) {
            return 8;
        } else if (amountSpent <= 150) {
            return 10;
        } else if (amountSpent <= 210) {
            return 12;
        } else {
            return 14;
        }
    }
}

