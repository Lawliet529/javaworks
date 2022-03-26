package lab4.numbertheory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. Exercises on Algorithms - Number Theory
 *
 * <p>4.3. Prime Factors
 */
public class PerfectPrimeFactorList {

  public static void main(String[] args) {
    System.out.print("Enter the upper bound: ");
    int bound = new Scanner(System.in).nextInt();

    ArrayList<Integer> productsOfPrimeFactors = new ArrayList<>();

    for (int i = 1; i <= bound; i++) {
      if (isProductOfPrimeFactors(i)) {
        productsOfPrimeFactors.add(i);
      }
    }

    System.out.println("These numbers are equal to the product of prime factors:");
    for (int i : productsOfPrimeFactors) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.printf(
        "[%d numbers found (%.2f%%)]",
        productsOfPrimeFactors.size(), (double) 100 * productsOfPrimeFactors.size() / bound);
  }

  public static boolean isProductOfPrimeFactors(int posInt) {
    int product = 1;
    for (int i = 2; i <= posInt / 2; i++) {
      if (PrimeList.isPrime(i) && posInt % i == 0) {
        product *= i;
      }
    }
    return product == posInt;
  }
}
