package lab4.more;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * 1. More Exercises
 *
 * <p>1.8. WordGuess
 */
public class WordGuess {

  public static void main(String[] args) {
    String secretWord;
    try {
      File words = new File("src/lab4/more/words.txt");
      Scanner reader = new Scanner(words);
      for (int i = 0; i < new Random().nextInt(851); i++) {
        reader.nextLine();
      }
      secretWord = reader.nextLine();
      reader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return;
    }

    boolean[] guessed = new boolean[secretWord.length()];
    int trials = 0;
    String guess;
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("Key in one character or your guess word: ");
      guess = input.nextLine().toLowerCase();
      trials++;

      if (guess.length() > 1 && guess.equals(secretWord)) {
        break;
      } else {
        for (int i = 0; i < secretWord.length(); i++) {
          if (secretWord.charAt(i) == guess.charAt(0)) {
            guessed[i] = true;
          }
        }
      }
      if (areAllTrue(guessed)) {
        break;
      }

      System.out.print("Trial " + trials + ": ");
      for (int i = 0; i < secretWord.length(); i++) {
        if (guessed[i]) {
          System.out.print(secretWord.charAt(i));
        } else {
          System.out.print("_");
        }
      }
      System.out.println();
    }
    input.close();

    System.out.println("Congratulation! The secret word is: " + secretWord);
    System.out.println("You got it in " + trials + " trials");
  }

  public static boolean areAllTrue(boolean[] status) {
    for (boolean c : status) {
      if (!c) {
        return false;
      }
    }
    return true;
  }
}
