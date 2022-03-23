package lab3.method;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Exercises on Method
 * 2.11. GradesStatistics
 */
public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is: %.2f%n", average(grades));
        System.out.printf("The median is: %.2f%n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f%n", stdDev(grades));
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

    public static double average(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }

    public static double median(int[] array) {
        int length = array.length;
        Arrays.sort(array);
        if (length % 2 == 0) {
            return (double) (array[length / 2 - 1] + array[length / 2]) / 2;
        } else {
            return array[length / 2];
        }
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static double stdDev(int[] array) {
        double mean = average(array);
        double sum = 0;
        for (int value : array) {
            sum += Math.pow(value - mean, 2);
        }
        return Math.sqrt(sum / array.length);
    }
}
