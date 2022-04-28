package lab6.classes;

import java.math.BigInteger;

/**
 * 1. More Exercises on Classes
 *
 * <p>1.3 Using JDK’s BigInteger Class
 */
public class BigIntegerTest {

  public static void main(String[] args) {
    BigInteger a = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
    BigInteger b = new BigInteger("22222222222222222222222222222222222222222222222222");

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("a + b = " + a.add(b));
    System.out.println("a x b = " + a.multiply(b));
  }
}
