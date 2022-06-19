package lab10.collections.polynomials;

import java.util.Arrays;

public abstract class AbstractPoly implements Poly {

  public AbstractPoly() {}

  double[] derive() {
    return coefficients();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof AbstractPoly)) {
      return false;
    }

    return Arrays.equals(coefficients(), ((AbstractPoly) obj).coefficients());
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
