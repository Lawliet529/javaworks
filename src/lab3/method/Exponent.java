package lab3.method;

import java.util.Scanner;

/**
 * 2. Exercises on Method
 *
 * <p>2.1. exponent()
 */
public class Exponent {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the base: ");
    int base = input.nextInt();
    System.out.print("Enter the exponent: ");
    int exp = input.nextInt();
    input.nextLine();
    input.close();

    System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
  }

  public static int exponent(int base, int exp) {
    int product = 1;
    for (int i = 0; i < exp; i++) {
      product *= base;
    }
    return product;
  }
}
