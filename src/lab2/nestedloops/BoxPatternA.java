package lab2.nestedloops;

import java.util.Scanner;

/**
 * 1. Exercises on Nested-Loops
 * 1.5.a. BoxPatternA
 */
public class BoxPatternA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.nextLine();
        input.close();

        for (int row = 1; row <= size; row++) {
            System.out.print("# ");

            if (row == 1 || row == size) {
                for (int col = 2; col <= size - 1; col++) {
                    System.out.print("# ");
                }
            } else {
                for (int col = 2; col <= size - 1; col++) {
                    System.out.print("  ");
                }
            }

            System.out.println("#");
        }
    }
}
