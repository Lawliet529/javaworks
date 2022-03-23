package lab1._1gettingstarted;

/**
 * 1. Getting Started Exercises
 * 1.1. Getting.Started.Exercises.CheckPassFail
 */
public class CheckPassFail {
    public static void main(String[] args) {
        int[] marks = {0, 49, 50, 51, 100}; // Using an array instead of single variables

        for (int mark : marks) { // Repeat process for each number in array
            System.out.println("The mark is " + mark);

            if (mark >= 50) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }

        System.out.println("DONE");
    }
}
