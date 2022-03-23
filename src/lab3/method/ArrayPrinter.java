package lab3.method;

import java.util.Random;

/**
 * 2. Exercises on Method
 * 2.3. print()
 */
public class ArrayPrinter {
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

        print(emptyArray);
        print(oneElementArray);
        print(array);
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
