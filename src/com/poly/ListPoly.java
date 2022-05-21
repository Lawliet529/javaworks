package com.poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class representing a polynomial with coefficients stored as a list
 */
public class ListPoly extends AbstractPoly {

  private List<Integer> coefficients;

  public ListPoly(int[] coefficients) {
    if (coefficients.length == 0) {
      this.coefficients = new ArrayList<>();
      this.coefficients.add(0);
      degree = 0;
      return;
    }

    degree = coefficients.length - 1;
    this.coefficients = Arrays.stream(coefficients).boxed().collect(Collectors.toList());
    reduce();
  }

  private void reduce() {
    while (degree > 0 && coefficient(degree) == 0) {
      coefficients.remove(degree);
      degree--;
    }
  }

  @Override
  public Poly derivative() {
    return new ListPoly(differentiate());
  }

  @Override
  public int coefficient(int degree) {
    return coefficients.get(degree);
  }

  @Override
  public int[] coefficients() {
    return coefficients.stream().mapToInt(i -> i).toArray();
  }

  @Override
  public String type() {
    return "List Poly";
  }
}
