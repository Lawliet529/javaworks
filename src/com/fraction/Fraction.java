package com.fraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fraction extends Number implements Comparable<Fraction> {

  private int numerator;
  private int denominator;

  /**
   * Creates a new instance of Fraction
   */

  public Fraction(Fraction another) {
    this.numerator = another.numerator;
    this.denominator = another.denominator;
    simplify();
  }

  public Fraction(int numerator, int denominator) {
    if (denominator == 0) {
      throw new ArithmeticException("Denominator cannot be 0.");
    }

    this.numerator = numerator;
    this.denominator = denominator;
    simplify();
  }

  public Fraction(int numerator) {
    this.numerator = numerator;
    denominator = 1;
  }

  private static int gcd(int m, int n) {
    if (n == 0) {
      return m;
    }
    return gcd(n, m % n);
  }

  /**
   * Our main method tests our class and demonstrates behavior
   */
  public static void main(String[] args) {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(2, 3);
    Fraction f3 = new Fraction(1, 4);

    System.out.println(f1.add(1));
    System.out.println(f1.intValue());
    System.out.println(f1.doubleValue());

    List<Fraction> myFractions = new ArrayList<>();
    myFractions.add(f1);
    myFractions.add(f2);
    myFractions.add(f3);
    Collections.sort(myFractions);

    for (Fraction f : myFractions) {
      System.out.println(f);
    }
  }

  public int getNumerator() {
    return numerator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
    simplify();
  }

  public int getDenominator() {
    return denominator;
  }

  public void setDenominator(int denominator) {
    if (denominator == 0) {
      throw new ArithmeticException("Denominator cannot be 0.");
    }

    this.denominator = denominator;
    simplify();
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fraction fraction = (Fraction) o;
    return numerator == fraction.numerator
        && denominator == fraction.denominator;
  }

  public double doubleValue() {
    return (double) numerator / denominator;
  }

  public float floatValue() {
    return (float) numerator / denominator;
  }

  public int intValue() {
    return numerator / denominator;
  }

  public long longValue() {
    return numerator / denominator;
  }

  public int compareTo(Fraction other) {
    return Integer.compare(numerator * other.denominator, other.numerator * denominator);
  }

  private void simplify() {
    int gcd = gcd(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
  }

  public Fraction add(Fraction other) {
    return new Fraction(
        numerator * other.denominator + other.numerator * denominator,
        denominator * other.denominator
    );
  }

  public Fraction add(int other) {
    return new Fraction(
        numerator + other * denominator,
        denominator
    );
  }
}
