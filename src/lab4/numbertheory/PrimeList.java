package lab4.numbertheory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. Exercises on Algorithms - Number Theory
 *
 * <p>4.2. Prime Numbers
 */
public class PrimeList {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the upper bound: ");
    int bound = input.nextInt();
    input.close();

    ArrayList<Integer> primes = new ArrayList<>();

    for (int i = 1; i <= bound; i++) {
      if (isPrime(i)) {
        primes.add(i);
      }
    }

    for (int i : primes) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.printf(
        "[%d primes found (%.2f%%)]", primes.size(), (double) 100 * primes.size() / bound);
  }

  public static boolean isPrime(int posInt) {
    for (int i = 2; i <= Math.sqrt(posInt); i++) {
      if (posInt % i == 0) {
        return false;
      }
    }
    return true;
  }
}
