package lab1.decisionandloop;

/**
 * 2. Exercises on Decision and Loop
 *
 * <p>2.5. ExtractDigits
 */
public class ExtractDigits {

  public static void main(String[] args) {
    int number = 15423;

    while (number > 0) {
      System.out.print(number % 10 + " ");
      number /= 10;
    }
  }
}
