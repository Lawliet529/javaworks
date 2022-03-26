package lab4.sortandsearch;

import java.util.Arrays;
import java.util.Random;

/**
 * 3. Exercises on Algorithms - Sorting and Searching
 *
 * <p>3.3. Bubble Sort
 */
public class BubbleSort {

  public static void main(String[] args) {
    Random rd = new Random();
    int[] array = rd.ints(10, 0, 10).toArray();
    System.out.println("array = " + Arrays.toString(array));

    bubbleSort(array);
    System.out.println("sorted = " + Arrays.toString(array));
  }

  public static void bubbleSort(int[] array) {
    int n = array.length;
    if (n == 0 || n == 1) {
      return;
    }
    boolean swapped;

    int tmp;
    do {
      swapped = false;
      for (int i = 1; i < n; i++) {
        if (array[i - 1] > array[i]) {
          tmp = array[i - 1];
          array[i - 1] = array[i];
          array[i] = tmp;
          swapped = true;
        }
      }
    } while (swapped);
  }
}
