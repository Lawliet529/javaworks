package lab3.method;

import java.util.Random;

/**
 * 2. Exercises on Method
 * 2.4. arrayToString()
 */
public class Array2StringConverter {
    public static void main(String[] args) {
        Random rd = new Random();

        // Generate random arrays
        int numElements = rd.nextInt(9) + 2;
        int[] emptyArray = {};
        int[] oneElementArray = {rd.nextInt(10)};
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = rd.nextInt(10);
        }

        System.out.println(arrayToString(emptyArray));
        System.out.println(arrayToString(oneElementArray));
        System.out.println(arrayToString(array));
    }

    public static String arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                str = str.concat(", ");
            }
            str = str.concat(Integer.toString(array[i]));
        }
        str = str.concat("]");
        return str;
    }
}
