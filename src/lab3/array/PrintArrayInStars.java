package lab3.array;

import java.util.Scanner;

/**
 * 1. Exercises on Array
 *
 * <p>1.2. PrintArrayInStars
 */
public class PrintArrayInStars {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of items: ");
    final int NUM_ITEMS = input.nextInt();
    System.out.print("Enter the value of all items (separated by a space): ");
    int[] items = new int[NUM_ITEMS];
    for (int i = 0; i < NUM_ITEMS; i++) {
      items[i] = input.nextInt();
    }
    input.nextLine();
    input.close();

    for (int i = 0; i < NUM_ITEMS; i++) {
      System.out.print(i + ": ");
      for (int time = 0; time < items[i]; time++) {
        System.out.print("*");
      }
      System.out.println("(" + items[i] + ")");
    }
  }
}
