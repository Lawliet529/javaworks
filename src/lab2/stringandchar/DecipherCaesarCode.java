package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.5. Decipher Caesar’s Code
 */
public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = input.nextLine().toUpperCase();
        input.close();

        System.out.print("The plaintext string is: ");
        for (int index = 0; index < inStr.length(); index++) {
            if ("DEFGHIJKLMNOPQRSTUVWXYZ".indexOf(inStr.charAt(index)) != -1) {
                System.out.print((char) (inStr.charAt(index) - 3));
            } else if ("ABC".indexOf(inStr.charAt(index)) != -1) {
                System.out.print((char) (inStr.charAt(index) + 23));
            }
        }
        System.out.println();
    }
}
