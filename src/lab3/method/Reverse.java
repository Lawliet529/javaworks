package lab3.method;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Exercises on Method
 * 2.10. reverse()
 */
public class Reverse {
    public static void main(String[] args) {
        Random rd = new Random();

        int numElements = rd.nextInt(9) + 2;
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = rd.nextInt(10);
        }
        System.out.println("The array is: " + Arrays.toString(array));

        reverse(array);
        System.out.println("The reversed array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}
