package lab2.nestedloops;

import java.util.Scanner;

/**
 * 1. Exercises on Nested-Loops
 * 1.6.b. HillPatternB
 */
public class HillPatternB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.nextLine();
        input.close();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col < size * 2; col++) {
                if (col >= row && col + row <= size * 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
