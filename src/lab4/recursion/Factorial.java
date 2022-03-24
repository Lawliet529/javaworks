package lab4.recursion;

import java.util.Scanner;

/**
 * 2. Exercises on Recursion
 * 2.1. Factorial Recursive
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();

        System.out.println("The factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
