package lab3.array;

import java.util.Scanner;

/**
 * 1. Exercises on Array
 *
 * <p>1.4 Hex2Bin
 */
public class Hex2Bin {

  public static void main(String[] args) {
    final String[] HEX_BITS = {
        "0000", "0001", "0010", "0011",
        "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1111"
    };

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Hexadecimal string: ");
    String inStr = input.nextLine();
    input.close();

    System.out.print("The equivalent binary for hexadecimal \"" + inStr + "\" is:");
    for (int index = 0; index < inStr.length(); index++) {
      if (Character.isDigit(inStr.charAt(index))) {
        System.out.print(" " + HEX_BITS[inStr.charAt(index) - '0']);
      } else {
        switch (inStr.toUpperCase().charAt(index)) {
          case 'A':
            System.out.print(" " + HEX_BITS[10]);
            break;
          case 'B':
            System.out.print(" " + HEX_BITS[11]);
            break;
          case 'C':
            System.out.print(" " + HEX_BITS[12]);
            break;
          case 'D':
            System.out.print(" " + HEX_BITS[13]);
            break;
          case 'E':
            System.out.print(" " + HEX_BITS[14]);
            break;
          case 'F':
            System.out.print(" " + HEX_BITS[15]);
            break;
        }
      }
    }
    System.out.println();
  }
}
