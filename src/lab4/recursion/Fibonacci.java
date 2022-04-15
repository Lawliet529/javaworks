package lab4.recursion;

import java.util.Scanner;

/**
 * 2. Exercises on Recursion
 *
 * <p>2.2. Fibonacci (Recursive)
 */
public class Fibonacci {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    input.close();

    System.out.println("F(" + n + ") = " + fibonacci(n));
  }

  public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
