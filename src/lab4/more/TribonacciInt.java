package lab4.more;

/**
 * 1. More Exercises
 *
 * <p>1.5.1. TribonacciInt (Handling Overflow)
 */
public class TribonacciInt {

  public static void main(String[] args) {
    System.out.println("F(0) = 1");
    System.out.println("F(1) = 1");
    System.out.println("F(2) = 2");

    int n = 3;
    int fn;
    int fnMinus1 = 2;
    int fnMinus2 = 1;
    int fnMinus3 = 1;

    while (Integer.MAX_VALUE - fnMinus1 >= fnMinus2 + fnMinus3) {
      System.out.println("F(" + n + ") = " + (fn = fnMinus1 + fnMinus2 + fnMinus3));
      fnMinus3 = fnMinus2;
      fnMinus2 = fnMinus1;
      fnMinus1 = fn;
      n++;
    }

    System.out.println("F(" + n + ") is out of the range of int");
  }
}
