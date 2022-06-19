package lab6.classes;

class MyPolynomialTest {

  public static void main(String[] args) {
    MyPolynomial polynomial = new MyPolynomial(new double[] {1, 2, 3, 4});
    MyPolynomial polynomial2 = new MyPolynomial(new double[] {1, 2, 3});
    System.out.println(polynomial);

    System.out.println(polynomial.add(polynomial2));
    System.out.println(polynomial.multiply(polynomial2));
  }
}
