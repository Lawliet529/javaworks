package lab4.algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * 3. Exercises on Algorithms - Sorting and Searching
 * 3.4. Selection Sort
 */
public class SelectionSort {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = rd.ints(10, 0, 10).toArray();
        System.out.println("array = " + Arrays.toString(array));

        selectionSort(array);
        System.out.println("sorted = " + Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        if (n == 1) return;

        int tmp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}