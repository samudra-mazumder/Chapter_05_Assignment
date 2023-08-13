package E5_21;

import java.util.Scanner;

class Month {
    public int getLength(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("Invalid month number");
        }

        boolean isEvenMonth = monthNumber % 2 == 0;
        boolean isThirtyDayMonth = (monthNumber <= 7 && isEvenMonth) || (monthNumber > 7 && !isEvenMonth);

        if (monthNumber == 2) {
            return 28; // February always has 28 days
        } else if (isThirtyDayMonth) {
            return 30;
        } else {
            return 31;
        }
    }
}

public class MonthDaysProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1 for January, 2 for February, etc.): ");
        int monthNumber = scanner.nextInt();

        Month month = new Month();
        int days = month.getLength(monthNumber);

        System.out.println(days + " days");

        scanner.close();
    }
}
