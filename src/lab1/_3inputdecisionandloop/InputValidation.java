package lab1._3inputdecisionandloop;

import java.util.Scanner;

/**
 * 3. Exercises on Input, Decision and Loop
 * 3.6. InputValidation
 */
public class InputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number between 1-10 or 90-100: ");
            int number = input.nextInt();
            input.nextLine();

            if ((1 <= number && number <= 10) || (90 <= number && number <= 100)) {
                System.out.println("You have entered: " + number);
                break;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }

        input.close();
    }
}
