package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 *
 * <p>3.4. Caesar’s Code
 */
public class CaesarCode {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a plaintext string: ");
    String inStr = input.nextLine().toUpperCase();
    input.close();

    System.out.print("The ciphertext string is: ");
    for (int index = 0; index < inStr.length(); index++) {
      if ("ABCDEFGHIJKLMNOPQRSTUVW".indexOf(inStr.charAt(index)) != -1) {
        System.out.print((char) (inStr.charAt(index) + 3));
      } else if ("XYZ".indexOf(inStr.charAt(index)) != -1) {
        System.out.print((char) (inStr.charAt(index) - 23));
      }
    }
    System.out.println();
  }
}
