package lab4.more;

/**
 * 1. More Exercises
 *
 * <p>1.4. FactorialInt (Handling Overflow)
 */
public class FactorialInt {

  public static void main(String[] args) {
    int factorial = 1;
    int n = 1;
    while (Integer.MAX_VALUE / factorial >= n) {
      factorial *= n;
      System.out.println("The factorial of " + n + " is " + factorial);
      n++;
    }
    System.out.println("The factorial of " + n + " is out of range");
  }
}
