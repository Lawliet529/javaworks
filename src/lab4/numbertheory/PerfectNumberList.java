package lab4.numbertheory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. Exercises on Algorithms - Number Theory
 *
 * <p>4.1. Perfect and Deficient Numbers
 */
public class PerfectNumberList {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the upper bound: ");
    int bound = input.nextInt();
    input.close();

    ArrayList<Integer> perfects = new ArrayList<>();
    ArrayList<Integer> nonPerfects = new ArrayList<>();

    for (int i = 1; i <= bound; i++) {
      if (isPerfect(i)) {
        perfects.add(i);
      } else if (!isDeficient(i)) {
        nonPerfects.add(i);
      }
    }

    System.out.println("These numbers are perfect:");
    for (int i : perfects) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.printf(
        "[%d perfect numbers found (%.2f%%)]%n",
        perfects.size(), (double) 100 * perfects.size() / bound);
    System.out.println();

    System.out.println("These numbers are neither deficient nor perfect:");
    for (int i : nonPerfects) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.printf(
        "[%d numbers found (%.2f%%)]%n",
        nonPerfects.size(), (double) 100 * nonPerfects.size() / bound);
  }

  public static boolean isPerfect(int posInt) {
    int sum = 0;
    for (int i = 1; i <= posInt / 2; i++) {
      if (posInt % i == 0) {
        sum += i;
      }
    }
    return sum == posInt;
  }

  public static boolean isDeficient(int posInt) {
    int sum = 0;
    for (int i = 1; i <= posInt / 2; i++) {
      if (posInt % i == 0) {
        sum += i;
      }
    }
    return sum < posInt;
  }
}
