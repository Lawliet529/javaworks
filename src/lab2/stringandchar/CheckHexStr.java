package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.8. CheckHexStr
 */
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = input.nextLine();
        input.close();

        String loweredStr = inStr.toLowerCase();

        boolean isHex = true;
        for (int index = 0; index < loweredStr.length(); index++) {
            if (!(Character.isDigit(loweredStr.charAt(index)) ||
                    ('a' <= loweredStr.charAt(index) && loweredStr.charAt(index) <= 'f'))) {
                isHex = false;
                break;
            }
        }

        if (isHex) {
            System.out.println("\"" + inStr + "\" is a hex string.");
        } else {
            System.out.println("\"" + inStr + "\" is NOT a hex string.");
        }
    }
}
