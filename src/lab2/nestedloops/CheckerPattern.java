package lab2.nestedloops;

import java.util.Scanner;

/**
 * 1. Exercises on Nested-Loops
 * 1.2. CheckerPattern
 */
public class CheckerPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.nextLine();
        input.close();

        for (int row = 0; row < size; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < size; col++) {
                    System.out.print("# ");
                }
            } else {
                for (int col = 0; col < size; col++) {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
}
