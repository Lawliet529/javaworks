package lab4.numbertheory;

import java.util.Scanner;

/**
 * 4. Exercises on Algorithms - Number Theory
 *
 * <p>4.4. Greatest Common Divisor (GCD)
 */
public class GreatestCommonDivisor {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("a = ");
    int a = input.nextInt();
    System.out.print("b = ");
    int b = input.nextInt();
    input.close();

    System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
  }

  public static int gcd(int a, int b) {
    int tmp;
    while (b != 0) {
      tmp = b;
      b = a % b;
      a = tmp;
    }
    return a;
  }
}
