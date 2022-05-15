package lab10.collections.polynomials;

public interface Poly {

  double[] coefficients();

  double coefficient(int i);

  int degree();

  Poly derivative();
}
