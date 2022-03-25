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

        System.out.printf(
                "\"%s\" in radix %d is \"%s\" in radix %d.",
                inStr,
                inRadix,
                toRadix(inStr, inRadix, outRadix),
                outRadix
        );
    }

    public static String toRadix(String inStr, int inRadix, int outRadix) {
        // Convert to decimal
        int decimal = Integer.parseInt(inStr, inRadix);
        // Convert to radix
        return Integer.toString(decimal, outRadix);
    }
}
