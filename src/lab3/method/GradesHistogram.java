package lab3.method;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 2. Exercises on Method
 * 2.12. GradesHistogram
 */
public class GradesHistogram {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);

        int[] groups = new int[10];
        for (int value : grades) {
            if (value == 100) {
                groups[9]++;
            } else {
                groups[value / 10]++;
            }
        }

        histVertical(groups);
        System.out.println();
        histHorizontal(groups);
    }

    public static void readGrades() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        grades = new int[numStudents];
        for (int studentNo = 0; studentNo < numStudents; studentNo++) {
            System.out.print("Enter the grade for student " + (studentNo + 1) + ": ");
            grades[studentNo] = input.nextInt();
        }
        input.nextLine();
        input.close();
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    public static void histVertical(int[] groups) {
        for (int row = 0; row < groups.length; row++) {
            System.out.printf("%2s -%3s: ",
                    row * 10,
                    row * 10 + ((row == groups.length - 1) ? 10 : 9));

            for (int i = 0; i < groups[row]; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void histHorizontal(int[] groups) {
        int max = IntStream.of(groups).max().orElse(0);
        for (int row = max; row > 0; row--) {
            for (int bar : groups) {
                if (bar >= row) {
                    System.out.print("  *   ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
        for (int bar = 0; bar < groups.length; bar++) {
            System.out.printf("%2s-%-3s",
                    bar * 10,
                    bar * 10 + ((bar == groups.length - 1) ? 10 : 9));
        }
        System.out.println();
    }
}
