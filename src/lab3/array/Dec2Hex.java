package lab3.array;

import java.util.Scanner;

/**
 * 1. Exercises on Array
 *
 * <p>1.5. Dec2Hex
 */
public class Dec2Hex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int number = input.nextInt();
    input.nextLine();
    input.close();

    // Find the length of hexadecimal string
    int length = 1;
    while (number >= Math.pow(16, length)) {
      length++;
    }

    char[] hexStr = new char[length];
    for (int i = length - 1; i >= 0; i--) {
      if (number % 16 < 10) {
        hexStr[i] = (char) ((number % 16) + '0');
      } else {
        switch (number % 16) {
          case 10:
            hexStr[i] = 'A';
            break;
          case 11:
            hexStr[i] = 'B';
            break;
          case 12:
            hexStr[i] = 'C';
            break;
          case 13:
            hexStr[i] = 'D';
            break;
          case 14:
            hexStr[i] = 'E';
            break;
          case 15:
            hexStr[i] = 'F';
            break;
        }
      }
      number /= 16;
    }

    System.out.println("The equivalent hexadecimal number is " + String.valueOf(hexStr));
  }
}
