package com.poly;

/**
 * Class representing a polynomial with coefficients stored as on array of int
 */
public class ArrayPoly extends AbstractPoly {

  private int[] coefficients;

  public ArrayPoly(int[] coefficients) {
    if (coefficients.length == 0) {
      this.coefficients = new int[]{0};
      degree = 0;
      return;
    }

    degree = coefficients.length - 1;
    this.coefficients = coefficients;
    reduce();
  }

  private void reduce() {
    while (degree > 0 && coefficient(degree) == 0) {
      degree--;
    }

    int[] newArr = new int[degree + 1];
    System.arraycopy(coefficients, 0, newArr, 0, degree + 1);
    coefficients = newArr;
  }

  @Override
  public Poly derivative() {
    return new ArrayPoly(differentiate());
  }

  @Override
  public int coefficient(int degree) {
    return coefficients[degree];
  }

  @Override
  public int[] coefficients() {
    return coefficients;
  }

  @Override
  public String type() {
    return "Array Poly";
  }
}
