package lab4.more;

import java.util.Random;

/**
 * 1. More Exercises
 *
 * <p>1.3. Exponential Series
 */
public class SpecialSeries {

  public static void main(String[] args) {
    double x = new Random().nextDouble() * 2 - 1;
    int numTerms = 10000;
    System.out.println("x = " + x);
    System.out.println(specialSeries(x, numTerms));
  }

  public static double specialSeries(double x, int numTerms) {
    double sum = x;
    double term = x;
    for (int n = 2; n < numTerms; n += 2) {
      term *= ((double) (n - 1) * (n - 1) / n) * (x * x / (n + 1));
      sum += term;
    }
    return sum;
  }
}
