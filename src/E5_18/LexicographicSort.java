package E5_18;

import java.util.Scanner;

public class LexicographicSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three strings: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();

        String[] strings = { str1, str2, str3 };
        lexicographicSort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }

    public static void lexicographicSort(String[] strings) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
    }
}
