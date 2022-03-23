package lab3.method;

import java.util.Scanner;

/**
 * 2. Exercises on Method
 * 2.2. hasEight()
 */
public class MagicSum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            int number = input.nextInt();
            if (number == -1) break;

            if (hasEight(number)) {
                sum += number;
            }
        }
        input.close();

        System.out.println("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        String str = Integer.toString(number);
        return str.contains("8");
    }
}
