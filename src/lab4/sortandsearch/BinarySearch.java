package lab4.sortandsearch;

import java.util.Arrays;
import java.util.Random;

/**
 * 3. Exercises on Algorithms - Sorting and Searching
 *
 * <p>3.2. Recursive Binary Search
 */
public class BinarySearch {

  public static void main(String[] args) {
    Random rd = new Random();
    int[] array = rd.ints(10, 0, 10).toArray();
    Arrays.sort(array);
    int key = rd.nextInt(10);

    System.out.println("array = " + Arrays.toString(array));
    System.out.println("key = " + key);

    if (binarySearch(array, key)) {
      System.out.println("The key is found inside the array.");
    } else {
      System.out.println("The key is not found inside the array.");
    }
  }

  public static boolean binarySearch(int[] array, int key) {
    return binarySearch(array, key, 0, array.length);
  }

  public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
    if (fromIdx == toIdx) {
      return false; // Terminating empty list
    }
    if (fromIdx == toIdx - 1) {
      return key == array[fromIdx]; // Terminating one-element list
    }

    int middleIdx = (fromIdx + toIdx) / 2;
    if (key == array[middleIdx]) {
      return true;
    }
    if (key < array[middleIdx]) {
      return binarySearch(array, key, fromIdx, middleIdx);
    }
    if (key > array[middleIdx]) {
      return binarySearch(array, key, middleIdx, toIdx);
    }
    return false;
  }
}
