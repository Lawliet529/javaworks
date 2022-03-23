package lab3.method;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Exercises on Method
 * 2.6. search()
 */
public class Searcher {
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

        if (search(array, key) == -1) {
            System.out.println("Array " + Arrays.toString(array) + " does not contain " + key);
        } else {
            System.out.println("Index of " + key + " in " + Arrays.toString(array) + " is " + search(array, key));
        }
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }
}
