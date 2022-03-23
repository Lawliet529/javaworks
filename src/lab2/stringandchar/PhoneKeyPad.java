package lab2.stringandchar;

import java.util.Scanner;

/**
 * 3. Exercises on String and char Operations
 * 3.3. PhoneKeyPad
 */
public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = input.nextLine().toLowerCase();
        input.close();

        System.out.print("The String is converted to keypad digits: ");
        for (int index = 0; index < inStr.length(); index++) {
            if ("abc".indexOf(inStr.charAt(index)) != -1) {
                System.out.print(2);
            } else if ("def".indexOf(inStr.charAt(index)) != -1) {
                System.out.print(3);
            } else if ("ghi".indexOf(inStr.charAt(index)) != -1) {
                System.out.print(4);
            } else if ("jkl".indexOf(inStr.charAt(index)) != -1) {
                System.out.print(5);
            } else if ("mno".indexOf(inStr.charAt(index)) != -1) {
                System.out.print(6);
            } else if ("pqrs".indexOf(inStr.charAt(index)) != -1) {
                System.out.print(7);
            } else if ("tuv".indexOf(inStr.charAt(index)) != -1) {
                System.out.print(8);
            } else if ("wxyz".indexOf(inStr.charAt(index)) != -1) {
                System.out.print(9);
            }
        }
        System.out.println();
        System.out.print("This is the result using switch-case: ");
        toKeypad(inStr);
        System.out.println();
    }

    public static void toKeypad(String inStr) {
        for (int index = 0; index < inStr.length(); index++) {
            switch (inStr.charAt(index)) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print(9);
                    break;
            }
        }
    }
}
