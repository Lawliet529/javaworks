package lab4.more;

/**
 * 1. More Exercises
 *
 * <p>1.5. FibonacciInt (Handling Overflow)
 */
public class FibonacciInt {

  public static void main(String[] args) {
    System.out.println("F(0) = 1");
    System.out.println("F(1) = 1");

    int n = 2;
    int fn;
    int fnMinus1 = 1;
    int fnMinus2 = 1;

    while (Integer.MAX_VALUE - fnMinus1 >= fnMinus2) {
      System.out.println("F(" + n + ") = " + (fn = fnMinus1 + fnMinus2));
      fnMinus2 = fnMinus1;
      fnMinus1 = fn;
      n++;
    }

    System.out.println("F(" + n + ") is out of the range of int");
  }
}
