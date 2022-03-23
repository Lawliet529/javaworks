package lab1._3inputdecisionandloop;

import java.util.Scanner;

/**
 * 3. Exercises on Input, Decision and Loop
 * 3.1. SumProductMinMax3
 */
public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = input.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = input.nextInt();
        input.nextLine();
        input.close();

        System.out.println("The sum is: " + (number1 + number2 + number3));
        System.out.println("The product is: " + (number1 * number2 * number3));

        int min = Math.min(Math.min(number1, number2), number3);
        int max = Math.max(Math.max(number1, number2), number3);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
