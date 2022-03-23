package lab4.more;

/**
 * 1. More Exercises
 * 1.4.1. FactorialLong (Handling Overflow)
 */
public class FactorialLong {
    public static void main(String[] args) {
        long factorial = 1;
        int n = 1;
        while (Long.MAX_VALUE / factorial >= n) {
            factorial *= n;
            System.out.println("The factorial of " + n + " is " + factorial);
            n++;
        }
        System.out.println("The factorial of " + n + " is out of range");
    }
}
