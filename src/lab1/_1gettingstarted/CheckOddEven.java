package lab1._1gettingstarted;

/**
 * 1. Getting Started Exercises
 * 1.2. Getting.Started.Exercises.CheckOddEven
 */
public class CheckOddEven {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 88, 99, -1, -2}; // Using an array instead of single variables

        for (int number : numbers) { // Repeat process for each number in array
            System.out.println("The number is " + number);

            if (number % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }

        System.out.println("Bye!");
    }
}
