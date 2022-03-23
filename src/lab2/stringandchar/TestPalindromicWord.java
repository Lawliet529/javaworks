package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.7.1. TestPalindromicWord
 */
public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inStr = input.nextLine();
        input.close();

        String loweredStr = inStr.toLowerCase();

        boolean isPalindrome = true;
        for (int forwardIndex = 0, backwardIndex = inStr.length() - 1;
             forwardIndex < backwardIndex;
             forwardIndex++, backwardIndex--) {
            if (loweredStr.charAt(forwardIndex) != loweredStr.charAt(backwardIndex)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + inStr + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inStr + "\" is not a palindrome.");
        }
    }
}
