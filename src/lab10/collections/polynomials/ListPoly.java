package lab10.collections.polynomials;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class ListPoly extends AbstractPoly {

  List<Double> coefficients;

  public ListPoly(double[] coefficients) {
    this.coefficients = DoubleStream.of(coefficients).boxed().collect(Collectors.toList());
  }

  @Override
  public int degree() {
    return coefficients.size();
  }

  @Override
  public Poly derivative() {
    return this;
  }

  @Override
  public double coefficient(int i) {
    return coefficients.get(i);
  }

  @Override
  public double[] coefficients() {
    double[] out = new double[coefficients.size()];

    for (int i = 0; i < out.length; i++) {
      out[i] = coefficients.get(i);
    }
    return out;
  }
}
