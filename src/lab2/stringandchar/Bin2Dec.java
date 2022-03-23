package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.9. Bin2Dec
 */
public class Bin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String inStr = input.nextLine();
        input.close();

        int decimal = 0;
        boolean isBin = true;
        for (int index = 0; index < inStr.length(); index++) {
            if ('0' <= inStr.charAt(index) && inStr.charAt(index) <= '1') {
                decimal += (inStr.charAt(index) - '0') * Math.pow(2, inStr.length() - 1 - index);
                continue;
            }
            isBin = false;
            break;
        }

        if (isBin) {
            System.out.println("The equivalent decimal number for binary \"" + inStr + "\" is: " + decimal);
        } else {
            System.out.println("error: invalid binary string \"" + inStr + "\"");
        }
    }
}
