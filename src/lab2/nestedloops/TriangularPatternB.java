package lab2.nestedloops;

import java.util.Scanner;

/**
 * 1. Exercises on Nested-Loops
 * 1.4.b. TriangularPatternB
 */
public class TriangularPatternB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.nextLine();
        input.close();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col > size + 1) {
                    break;
                }
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
