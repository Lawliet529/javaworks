package lab1._2decisionandloop;

/**
 * 2. Exercises on Decision and Loop
 *
 * <p>2.2. HarmonicSum
 */
public class HarmonicSum {

  public static void main(String[] args) {
    final int MAX_DENOMINATOR = 50000;
    double sumL2R = 0.0;
    double sumR2L = 0.0;

    // Summing from left to right
    for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
      sumL2R += (double) 1 / denominator;
    }
    System.out.println("The sum from left to right is: " + sumL2R);

    // Summing from right to left (More accurate)
    for (int denominator = MAX_DENOMINATOR; denominator >= 1; denominator--) {
      sumR2L += (double) 1 / denominator;
    }
    System.out.println("The sum from right to left is: " + sumR2L);

    // Find the absolute difference
    double absDiff = (sumL2R > sumR2L) ? (sumL2R - sumR2L) : (sumR2L - sumL2R);
    System.out.println("The absolute difference is: " + absDiff);
  }
}
