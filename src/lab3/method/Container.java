package lab3.method;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Exercises on Method
 * 2.5. contains()
 */
public class Container {
    public static void main(String[] args) {
        Random rd = new Random();

        int key = rd.nextInt(10);
        System.out.println("The key is: " + key);

        int numElements = rd.nextInt(9) + 2;
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = rd.nextInt(10);
        }
        System.out.println("The array is: " + Arrays.toString(array));

        if (contains(array, key)) {
            System.out.println("Array " + Arrays.toString(array) + " contains " + key);
        } else {
            System.out.println("Array " + Arrays.toString(array) + " does not contain " + key);
        }
    }

    public static boolean contains(int[] array, int key) {
        for (int value : array) {
            if (value == key) return true;
        }
        return false;
    }
}
