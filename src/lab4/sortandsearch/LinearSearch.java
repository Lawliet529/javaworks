package lab4.sortandsearch;

import java.util.Arrays;
import java.util.Random;

/**
 * 3. Exercises on Algorithms - Sorting and Searching
 * 3.1. Linear Search
 */
public class LinearSearch {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = rd.ints(10, 0, 10).toArray();
        int key = rd.nextInt(10);

        System.out.println("array = " + Arrays.toString(array));
        System.out.println("key = " + key);

        if (linearSearch(array, key)) {
            System.out.println("The key is found inside the array.");
        } else {
            System.out.println("The key is not found inside the array.");
        }
        System.out.println("index = " + linearSearchIndex(array, key));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int value : array) {
            if (key == value) return true;
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) return index;
        }
        return -1;
    }
}
