package lab4.sortandsearch;

import java.util.Arrays;
import java.util.Random;

/**
 * 3. Exercises on Algorithms - Sorting and Searching
 * 3.5. Insertion Sort
 */
public class InsertionSort {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = rd.ints(10, 0, 10).toArray();
        System.out.println("array = " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("sorted = " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        if (n == 0 || n == 1) return;

        for (int leftmost = 0; leftmost < n; leftmost++) {
            for (int i = 0; i < leftmost; i++) {
                if (array[leftmost] < array[i]) {
                    push(array, i, leftmost);
                }
            }
        }
    }

    /**
     * Assigns value of end index to start index and push every
     * elements from start index (inclusive) to end index (exclusive)
     * one index to the right.
     */
    private static void push(int[] array, int start, int end) {
        int tmp = array[end];
        System.arraycopy(array, start, array, start + 1, end - start);
        array[start] = tmp;
    }
}
