package lab3.method;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Exercises on Method
 *
 * <p>2.8. copyOf()
 */
public class ArrayCopier {

  public static void main(String[] args) {
    Random rd = new Random();

    int numElements = rd.nextInt(9) + 2;
    int[] array = new int[numElements];
    for (int i = 0; i < numElements; i++) {
      array[i] = rd.nextInt(10);
    }
    System.out.println("The array is: " + Arrays.toString(array));

    int newLength = rd.nextInt(18) + 2;
    System.out.println("The new length is: " + newLength);

    System.out.println("The exact copy is: " + Arrays.toString(copyOf(array)));
    System.out.println("The copy with new length: " + Arrays.toString(copyOf(array, newLength)));
  }

  public static int[] copyOf(int[] array) {
    int[] result = new int[array.length];
    System.arraycopy(array, 0, result, 0, array.length);
    return result;
  }

  public static int[] copyOf(int[] array, int newLength) {
    int[] result = new int[newLength];
    for (int i = 0; i < newLength; i++) {
      try {
        result[i] = array[i];
      } catch (ArrayIndexOutOfBoundsException e) {
        result[i] = 0;
      }
    }
    return result;
  }
}
