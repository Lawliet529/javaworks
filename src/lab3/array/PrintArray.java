package lab3.array;

import java.util.Scanner;

/**
 * 1. Exercises on Array
 * 1.1. PrintArray
 */
public class PrintArray {
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

        System.out.print("The values are: [");
        for (int i = 0; i < NUM_ITEMS; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(items[i]);
        }
        System.out.println("]");
    }
}
