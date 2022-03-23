package lab1._3inputdecisionandloop;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 3. Exercises on Input, Decision and Loop
 * 3.1.1. SumProductMinMax5
 */
public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = input.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = input.nextInt();
        System.out.print("Enter 4th integer: ");
        int number4 = input.nextInt();
        System.out.print("Enter 5th integer: ");
        int number5 = input.nextInt();
        input.nextLine();
        input.close();

        System.out.println("The sum is: " + (number1 + number2 + number3 + number4 + number5));
        System.out.println("The product is: " + (number1 * number2 * number3 * number4 * number5));

        int min = IntStream.of(number1, number2, number3, number4, number5).min().getAsInt();
        int max = IntStream.of(number1, number2, number3, number4, number5).max().getAsInt();
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
