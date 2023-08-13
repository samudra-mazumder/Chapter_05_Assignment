package E5_20;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.nextLine().toUpperCase(); // Convert input to uppercase

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabetic character.");
        } else {
            char character = input.charAt(0);
            if (isVowel(character)) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }

        scanner.close();
    }

    public static boolean isVowel(char character) {
        character = Character.toUpperCase(character);
        return character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }
}

