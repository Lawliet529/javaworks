package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.6. Exchange Cipher
 */
public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = input.nextLine().toUpperCase();
        input.close();

        System.out.print("The ciphertext string is: ");
        for (int index = 0; index < inStr.length(); index++) {
            System.out.print((char) ('A' + 'Z' - inStr.charAt(index)));
        }
        System.out.println();

    }
}
