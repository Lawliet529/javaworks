package lab1._3inputdecisionandloop;

import java.util.Scanner;

/**
 * 3. Exercises on Input, Decision and Loop
 *
 * <p>3.5. ReverseInt
 */
public class ReverseInt {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int number = input.nextInt();
    input.close();

    System.out.print("The reverse is: ");
    while (number > 0) {
      System.out.print(number % 10);
      number /= 10;
    }
    System.out.println();
  }
}
