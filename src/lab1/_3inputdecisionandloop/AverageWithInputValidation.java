package lab1._3inputdecisionandloop;

import java.util.Scanner;

/**
 * 3. Exercises on Input, Decision and Loop
 *
 * <p>3.7. AverageWithInputValidation
 */
public class AverageWithInputValidation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    final int NUM_STUDENTS = 3;
    int sum = 0;
    for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
      while (true) {
        System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
        int mark = input.nextInt();
        input.nextLine();

        if (0 <= mark && mark <= 100) {
          sum += mark;
          break;
        } else {
          System.out.println("Invalid input, try again...");
        }
      }
    }

    input.close();

    System.out.printf("The average is: %.2f%n", (double) sum / NUM_STUDENTS);
  }
}
