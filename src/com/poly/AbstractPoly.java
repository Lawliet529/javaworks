package com.poly;

import java.util.Arrays;
import java.util.StringJoiner;

public abstract class AbstractPoly implements Poly {

  protected int degree;

  @Override
  public int degree() {
    return degree;
  }

  int[] differentiate() {
    if (degree == 0) {
      return new int[]{0};
    }

    int[] d = new int[degree];
    for (int i = 0; i < degree(); i++) {
      d[i] = coefficient(i + 1) * (i + 1);
    }
    return d;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractPoly that = (AbstractPoly) o;
    return Arrays.compare(coefficients(), that.coefficients()) == 0;
  }

  @Override
  public String toString() {
    if (degree == 0) {
      return coefficient(0) + "";
    }

    StringJoiner s = new StringJoiner(" + ");
    for (int i = degree(); i >= 0; i--) {
      if (coefficient(i) == 0) {
        continue;
      }
      if (i == 0) {
        s.add(coefficient(i) + "");
        continue;
      }

      String coefficient = (coefficient(i) == 1) ? "" : (coefficient(i) + "");
      if (i == 1) {
        s.add(coefficient + "x");
        continue;
      }
      s.add(coefficient + "x^" + i);
    }
    return s.toString();
  }

  @Override
  public double evaluate(double x) {
    double sum = 0;
    for (int i = 0; i <= degree(); i++) {
      sum += coefficient(i) * Math.pow(x, i);
    }
    return sum;
  }
}
