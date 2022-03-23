package lab1._2decisionandloop;

/**
 * 2. Exercises on Decision and Loop
 * 2.1. SumAverageRunningInt
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        // Using for loop
        int sum = 0;
        int count = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += number;
            count++;
        }

        /*// Alternative 1: Using while-do loop
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            number++;
        }*/

        /*// Alternative 2: Using do-while loop
        int number = LOWERBOUND;
        do {
            sum += number;
            number++;
        } while (number <= UPPERBOUND);*/

        // Compute the average
        double average = (double) sum / count;

        // Sum of squares
        int sumOfSquares = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sumOfSquares += number * number;
        }

        // Sum of odd numbers and sum of even numbers
        int sumOdd = 0;
        int sumEven = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        // Compute Absolute Difference
        int absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven) : (sumEven - sumOdd);

        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);

        System.out.println("The sum of squares of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOfSquares);

        System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
        System.out.println("The sum of even numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);
        System.out.println("The absolute difference is " + absDiff);
    }
}
