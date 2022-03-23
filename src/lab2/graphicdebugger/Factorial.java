package lab2.graphicdebugger;

/**
 * 2. Debugging/Tracing Programs using a Graphic Debugger
 * 2.1. Factorial
 */
public class Factorial {
    public static void main(String[] args) { // Set an initial breakpoint at this statement
        int n = 20;
        long factorial = 1; // Change variable type to "long" to store larger values

        // n! = 1*2*3...*n
        for (int i = 1; i <= n; i++) { // i = 1, 2, 3, ..., n
            factorial = factorial * i; // * ∗
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}