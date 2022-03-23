package lab2.nestedloops;

import java.util.Scanner;

/**
 * 1. Exercises on Nested-Loops
 * 1.4.a. TriangularPatternA
 */
public class TriangularPatternA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.nextLine();
        input.close();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col > row) {
                    break;
                }
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
