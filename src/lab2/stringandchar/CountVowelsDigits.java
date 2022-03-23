package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.2. CountVowelsDigits
 */
public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = input.nextLine().toLowerCase();
        input.close();

        final String VOWELS = "aeiuo";
        int numVowels = 0;
        int numDigits = 0;
        for (int index = 0; index < inStr.length(); index++) {
            if (VOWELS.indexOf(inStr.charAt(index)) != -1) {
                numVowels++;
            } else if (Character.isDigit(inStr.charAt(index))) {
                numDigits++;
            }
        }

        System.out.printf("Number of vowels: %d (%.2f%%)%n", numVowels, (double) numVowels / inStr.length() * 100);
        System.out.printf("Number of digits: %d (%.2f%%)%n", numDigits, (double) numDigits / inStr.length() * 100);
    }
}
