package lab4.recursion;

import java.util.Scanner;

/**
 * 2. Exercises on Recursion
 * 2.4. GCD (Recursive)
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        input.close();

        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
