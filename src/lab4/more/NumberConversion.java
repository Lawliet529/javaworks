package lab4.more;

import java.util.Scanner;

/**
 * 1. More Exercises
 * 1.6. Number System Conversion
 */
public class NumberConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String inStr = input.nextLine().toUpperCase();
        System.out.print("Enter the input radix: ");
        int inRadix = input.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = input.nextInt();
        input.nextLine();
        input.close();

        System.out.println("\"" + inStr + "\" in radix " + inRadix +
                " is \"" + toRadix(inStr, inRadix, outRadix) + "\" in radix " + outRadix + ".");
    }

    public static String toRadix(String inStr, int inRadix, int outRadix) {
        int decimal = toDecimal(inStr, inRadix);

        // Determine the length of output string
        int length = 1;
        while (decimal >= Math.pow(outRadix, length)) {
            length++;
        }
        char[] outStr = new char[length];

        for (int i = length - 1; i >= 0; i--) {
            if (decimal % outRadix < 10) {
                // Process numbers
                outStr[i] = (char) ((decimal % outRadix) + '0');
            } else {
                // Process characters
                switch (decimal % outRadix) {
                    case 10:
                        outStr[i] = 'A';
                        break;
                    case 11:
                        outStr[i] = 'B';
                        break;
                    case 12:
                        outStr[i] = 'C';
                        break;
                    case 13:
                        outStr[i] = 'D';
                        break;
                    case 14:
                        outStr[i] = 'E';
                        break;
                    case 15:
                        outStr[i] = 'F';
                        break;
                }
            }
            decimal /= outRadix;
        }

        return String.valueOf(outStr);
    }

    private static int toDecimal(String inStr, int radix) {
        int decimal = 0;
        boolean isValid = true;

        for (int index = 0; index < inStr.length(); index++) {
            double pow = Math.pow(radix, inStr.length() - 1 - index);
            if ('0' <= inStr.charAt(index) && inStr.charAt(index) <= (char) (Math.min(radix - 1, 9) + '0')) {
                // Process numbers
                decimal += (inStr.charAt(index) - '0') * pow; // (int) returns ASCII code instead of the number
                continue;
            } else {
                // Process characters
                switch (inStr.toUpperCase().charAt(index)) {
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
            }

            isValid = false;
            break;
        }

        if (isValid) {
            return decimal;
        } else {
            throw new ArithmeticException("Invalid input.");
        }
    }
}
