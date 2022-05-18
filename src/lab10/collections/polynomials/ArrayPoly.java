package lab10.collections.polynomials;

public class ArrayPoly extends AbstractPoly {

  private double[] coefficients;

  public ArrayPoly(double[] coefficients) {
    this.coefficients = coefficients;
  }

  @Override
  public double[] coefficients() {
    return coefficients;
  }

  @Override
  public double coefficient(int i) {
    return coefficients[i];
  }

  @Override
  public int degree() {
    return coefficients.length;
  }

  @Override
  public Poly derivative() {
    return this;
  }
}
