package lab4.more;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. More Exercises
 * 1.7. NumberGuess
 */
public class NumberGuess {
    public static void main(String[] args) {
        final int SECRET_NUMBER = new Random().nextInt(100);
        int trials = 1;

        System.out.println("Key in your guess:");
        Scanner input = new Scanner(System.in);
        int guessedNumber = input.nextInt();
        while (guessedNumber != SECRET_NUMBER) {
            if (guessedNumber > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                System.out.println("Try higher");
            }
            guessedNumber = input.nextInt();
            trials++;
        }
        input.close();

        System.out.println("You got it in " + trials + " trials!");
    }
}
