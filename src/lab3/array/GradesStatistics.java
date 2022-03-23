package lab3.array;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 1. Exercises on Array
 * 1.3. GradesStatistics
 */
public class GradesStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] grades = new int[numStudents];
        for (int studentNo = 0; studentNo < numStudents; studentNo++) {
            System.out.print("Enter the grade for student " + (studentNo + 1) + ": ");
            grades[studentNo] = input.nextInt();
        }
        input.nextLine();
        input.close();

        System.out.printf("The average is: %.2f%n", IntStream.of(grades).average().orElse(0));
        System.out.println("The minimum is: " + IntStream.of(grades).min().orElse(0));
        System.out.println("The maximum is: " + IntStream.of(grades).max().orElse(0));
    }
}