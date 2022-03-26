package lab1._2decisionandloop;

/**
 * 2. Exercises on Decision and Loop
 *
 * <p>2.3. ComputePI
 */
public class ComputePI {

  public static void main(String[] args) {
    final int MAX_TERM = 10000;

    double sum = 0;
    for (int term = 1; term <= MAX_TERM; term++) {
      if (term % 2 == 1) {
        sum += 1.0 / (term * 2 - 1);
      } else {
        sum -= 1.0 / (term * 2 - 1);
      }
    }

    System.out.println(
        "The calculated PI is "
            + sum * 4
            + ", which is "
            + (sum * 4) / (Math.PI) * 100
            + "% of the real PI.");
  }
}
