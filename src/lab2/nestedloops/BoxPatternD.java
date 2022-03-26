package lab2.nestedloops;

import java.util.Scanner;

/**
 * 1. Exercises on Nested-Loops
 *
 * <p>1.5.d. BoxPatternD
 */
public class BoxPatternD {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = input.nextInt();
    input.nextLine();
    input.close();

    for (int col = 1; col < size; col++) {
      System.out.print("# ");
    }
    System.out.println("#");

    for (int row = 2; row < size; row++) {
      for (int col = 1; col <= size; col++) {
        if (row == col || row + col == size + 1) {
          System.out.print("# ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    for (int col = 1; col < size; col++) {
      System.out.print("# ");
    }
    System.out.println("#");
  }
}
