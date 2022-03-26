package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 *
 * <p>3.1. ReverseString
 */
public class ReverseString {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String inStr = input.nextLine();
    input.close();

    System.out.print("The reverse of the String \"" + inStr + "\" is \"");
    for (int index = inStr.length() - 1; index >= 0; index--) {
      System.out.print(inStr.charAt(index));
    }
    System.out.println("\".");
  }
}
