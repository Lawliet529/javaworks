package lab1._2decisionandloop;

/**
 * 2. Exercises on Decision and Loop
 *
 * <p>2.4.1. Tribonacci
 */
public class Tribonacci {

  public static void main(String[] args) {
    int nMax = 20;

    System.out.println("The first " + nMax + " Tribonacci numbers are: ");
    System.out.print("1 1 2 ");

    int fn;
    int fnMinus1 = 2;
    int fnMinus2 = 1;
    int fnMinus3 = 1;
    int sum = fnMinus1 + fnMinus2 + fnMinus3;

    int n = 4;
    while (n <= nMax) {
      System.out.print((fn = fnMinus1 + fnMinus2 + fnMinus3) + " ");
      sum += fn;
      fnMinus3 = fnMinus2;
      fnMinus2 = fnMinus1;
      fnMinus1 = fn;
      n++;
    }

    System.out.println();
    System.out.println("The average is " + (double) sum / nMax);
  }
}
