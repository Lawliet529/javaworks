package com.fraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class FractionTest {

  public static void main(String[] args) {
    Random random = new Random();

    List<Fraction> fractions = new ArrayList<>();
    for (int i = 0; i < 30; i++) {
      fractions.add(new Fraction(
          random.nextInt(1000) + 1,
          random.nextInt(1000) + 1
      ));
    }

    System.out.println("Unsorted:");
    print(fractions);
    System.out.println();

    System.out.println("Sorted by value:");
    print(sortByValue(fractions));
    System.out.println();

    System.out.println("Sorted by denominator:");
    print(sortByDenominator(fractions));
    System.out.println();

    System.out.println("Second largest value: " + getSecondLargestValue(fractions));
  }

  public static List<Fraction> sortByValue(List<Fraction> fractions) {
    List<Fraction> sorted = new ArrayList<>(fractions);
    Collections.sort(sorted);
    return sorted;
  }

  public static List<Fraction> sortByDenominator(List<Fraction> fractions) {
    List<Fraction> sorted = new ArrayList<>(fractions);
    sorted.sort(Comparator.comparingInt(Fraction::getDenominator));
    return sorted;
  }

  public static void print(List<Fraction> fractions) {
    for (Fraction fraction : fractions) {
      System.out.println(fraction);
    }
  }

  public static Fraction getSecondLargestValue(List<Fraction> fractions) {
    List<Fraction> sorted = sortByValue(fractions);
    Collections.reverse(sorted);
    return sorted.get(1);
  }
}
