package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 *
 * <p>3.11. Oct2Dec
 */
public class Oct2Dec {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an Octal string: ");
    String inStr = input.nextLine();
    input.close();

    int decimal = 0;
    boolean isOct = true;
    for (int index = 0; index < inStr.length(); index++) {
      if ('0' <= inStr.charAt(index) && inStr.charAt(index) <= '7') {
        decimal += (inStr.charAt(index) - '0') * Math.pow(8, inStr.length() - 1 - index);
        continue;
      }
      isOct = false;
      break;
    }

    if (isOct) {
      System.out.println(
          "The equivalent decimal number for octal \"" + inStr + "\" is: " + decimal);
    } else {
      System.out.println("error: invalid octal string \"" + inStr + "\"");
    }
  }
}
