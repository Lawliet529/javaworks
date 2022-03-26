package lab2.nestedloops;

import java.util.Scanner;

/**
 * 1. Exercises on Nested-Loops
 *
 * <p>1.3. TimeTable
 */
public class TimeTable {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = input.nextInt();
    input.nextLine();
    input.close();

    for (int row = -1; row <= size; row++) {
      switch (row) {
        case -1: // Special case for first row
          for (int col = -1; col <= size; col++) {
            switch (col) {
              case -1: // Special case for first column
                System.out.print(" *");
                break;
              case 0: // Special case for second column
                System.out.print(" |");
                break;
              default:
                System.out.printf("%4d", col);
            }
          }
          break;
        case 0: // Special case for second row
          for (int col = -1; col <= size; col++) {
            if (col < 1) {
              System.out.print("--");
            } else {
              System.out.print("----");
            }
          }
          break;
        default:
          for (int col = -1; col <= size; col++) {
            switch (col) {
              case -1: // Special case for first column
                System.out.printf("%2d", row);
                break;
              case 0: // Special case for second column
                System.out.print(" |");
                break;
              default:
                System.out.printf("%4d", row * col);
            }
          }
          break;
      }
      System.out.println();
    }
  }
}
