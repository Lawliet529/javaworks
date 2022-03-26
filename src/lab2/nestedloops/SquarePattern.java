package lab2.nestedloops;

import java.util.Scanner;

/**
 * 1. Exercises on Nested-Loops
 *
 * <p>1.1. SquarePattern
 */
public class SquarePattern {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = input.nextInt();
    input.nextLine();
    input.close();

    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        System.out.print("# ");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("Below is the result using nested while-do loop.");
    printSquare(size);
  }

  public static void printSquare(int size) {
    int row = 0;
    while (row < size) {
      int col = 0;
      while (col < size) {
        System.out.print("# ");
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
