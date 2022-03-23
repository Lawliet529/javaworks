package lab1._2decisionandloop;

/**
 * 2. Exercises on Decision and Loop
 * 2.4. Fibonacci
 */
public class Fibonacci {
    public static void main(String[] args) {
        int nMax = 20;

        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print("1 1 ");

        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int sum = fnMinus1 + fnMinus2;

        int n = 3;
        while (n <= nMax) {
            System.out.print((fn = fnMinus1 + fnMinus2) + " ");
            sum += fn;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            n++;
        }

        System.out.println();
        System.out.println("The average is " + (double) sum / nMax);
    }
}
