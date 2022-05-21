package com.poly;

/**
 * Interface representing a polynomial
 */
public interface Poly {

  int coefficient(int i);

  int[] coefficients();

  int degree();

  Poly derivative();

  double evaluate(double x);

  String type();
}

