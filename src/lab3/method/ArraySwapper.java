package lab3.method;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Exercises on Method
 *
 * <p>2.9. swap()
 */
public class ArraySwapper {

  public static void main(String[] args) {
    Random rd = new Random();

    int numElements = rd.nextInt(9) + 2;
    int[] array1 = new int[numElements];
    for (int i = 0; i < numElements; i++) {
      array1[i] = rd.nextInt(10);
    }
    System.out.println("The 1st array is: " + Arrays.toString(array1));

    numElements = rd.nextInt(9) + 2;
    int[] array2 = new int[numElements];
    for (int i = 0; i < numElements; i++) {
      array2[i] = rd.nextInt(10);
    }
    System.out.println("The 2nd array is: " + Arrays.toString(array2));

    if (swap(array1, array2)) {
      System.out.println("Two arrays are swapped successfully!");
      System.out.println("The 1st array is: " + Arrays.toString(array1));
      System.out.println("The 2nd array is: " + Arrays.toString(array2));
    } else {
      System.out.println("Swapping failed! Two arrays don't have the same length.");
    }
  }

  public static boolean swap(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    } else {
      for (int i = 0; i < array1.length; i++) {
        int tmp = array1[i];
        array1[i] = array2[i];
        array2[i] = tmp;
      }
      return true;
    }
  }
}
