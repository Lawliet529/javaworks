package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.7.2. TestPalindromicPhrase
 */
public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String inStr = input.nextLine();
        input.close();

        String loweredStr = inStr.toLowerCase();

        boolean isPalindrome = true;
        for (int forwardIndex = 0, backwardIndex = inStr.length() - 1;
             forwardIndex < backwardIndex;
             forwardIndex++, backwardIndex--) {
            while (!Character.isLetter(loweredStr.charAt(forwardIndex))) {
                forwardIndex++;
            }

            while (!Character.isLetter(loweredStr.charAt(backwardIndex))) {
                backwardIndex--;
            }

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
