package com.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PolyTest {

  public static void main(String[] args) {
    Random random = new Random();

    List<Poly> polyList = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      int length = random.nextInt(10);
      polyList.add(createArrayPoly(createRandomArray(length)));
    }
    for (int i = 0; i < 5; i++) {
      int length = random.nextInt(10);
      polyList.add(createListPoly(createRandomArray(length)));
    }

    for (Poly poly : polyList) {
      System.out.println(poly);
      System.out.println(poly.derivative());
      int x = random.nextInt(10);
      System.out.println(x);
      System.out.println(poly.evaluate(x));
      System.out.println(poly.type());
      System.out.println();
    }
  }

  public static ArrayPoly createArrayPoly(int[] coefficients) {
    return new ArrayPoly(coefficients);
  }

  public static ListPoly createListPoly(int[] coefficients) {
    return new ListPoly(coefficients);
  }

  public static int[] createRandomArray(int length) {
    Random random = new Random();
    int[] coefficients = new int[length];
    for (int i = 0; i < length; i++) {
      coefficients[i] = random.nextInt(10);
    }
    return coefficients;
  }
}
