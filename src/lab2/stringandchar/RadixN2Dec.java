package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.12. RadixN2Dec
 */
public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = input.nextInt();
        input.nextLine();
        System.out.print("Enter the string: ");
        String inStr = input.nextLine();
        input.close();

        int decimal = 0;
        boolean isValid = true;
        for (int index = 0; index < inStr.length(); index++) {
            double pow = Math.pow(radix, inStr.length() - 1 - index);
            if ('0' <= inStr.charAt(index) && inStr.charAt(index) <= (char) (Math.min(radix - 1, 9) + '0')) {
                decimal += (inStr.charAt(index) - '0') * pow; // (int) returns ASCII code instead of the number
                continue;
            } else switch (inStr.toUpperCase().charAt(index)) {
                case 'A':
                    if (radix >= 11) {
                        decimal += 10 * pow;
                        continue;
                    } else break;
                case 'B':
                    if (radix >= 12) {
                        decimal += 11 * pow;
                        continue;
                    } else break;
                case 'C':
                    if (radix >= 13) {
                        decimal += 12 * pow;
                        continue;
                    } else break;
                case 'D':
                    if (radix >= 14) {
                        decimal += 13 * pow;
                        continue;
                    } else break;
                case 'E':
                    if (radix >= 15) {
                        decimal += 14 * pow;
                        continue;
                    } else break;
                case 'F':
                    if (radix >= 16) {
                        decimal += 15 * pow;
                        continue;
                    } else break;
            }

            isValid = false;
            break;
        }

        if (isValid) {
            System.out.println("The equivalent decimal number for \"" + inStr + "\" is: " + decimal);
        } else {
            System.out.println("error: invalid string \"" + inStr + "\"");
        }
    }
}