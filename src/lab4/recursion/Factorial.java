package lab4.recursion;

import java.util.Scanner;

/**
 * 2. Exercises on Recursion
 *
 * <p>2.1. Factorial Recursive
 */
public class Factorial {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    input.close();

    System.out.println("The factorial of " + n + " is " + factorial(n));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
