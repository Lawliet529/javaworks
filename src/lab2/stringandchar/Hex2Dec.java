package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.10. Hex2Dec
 */
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inStr = input.nextLine();
        input.close();

        int decimal = 0;
        boolean isHex = true;
        for (int index = 0; index < inStr.length(); index++) {
            double pow = Math.pow(16, inStr.length() - 1 - index);
            if (Character.isDigit(inStr.charAt(index))) {
                decimal += (inStr.charAt(index) - '0') * pow; // (int) returns ASCII code instead of the number
                continue;
            } else switch (inStr.toUpperCase().charAt(index)) {
                case 'A':
                    decimal += 10 * pow;
                    continue;
                case 'B':
                    decimal += 11 * pow;
                    continue;
                case 'C':
                    decimal += 12 * pow;
                    continue;
                case 'D':
                    decimal += 13 * pow;
                    continue;
                case 'E':
                    decimal += 14 * pow;
                    continue;
                case 'F':
                    decimal += 15 * pow;
                    continue;
            }

            isHex = false;
            break;
        }

        if (isHex) {
            System.out.println("The equivalent decimal number for hexadecimal \"" + inStr + "\" is: " + decimal);
        } else {
            System.out.println("error: invalid hexadecimal string \"" + inStr + "\"");
        }
    }
}
