package trapezoidalrule;

public class TrapezoidalRule {

  public static void main(String[] args) {
    System.out.println("Trapezoidal Rule: " + integrate());
    System.out.println("Java Library: " + (double) 1 / 3 * Math.pow(Math.sin(Math.PI / 2), 3));
  }

  public static double f(double x) {
    return Math.sin(x) * Math.sin(x) * Math.cos(x);
  }

  public static double integrate(int n) {
    double a = 0;
    double b = Math.PI / 2;
    double h = (b - a) / n;
    double sum = (f(a) + f(a + n * h)) / 2;
    for (int i = 1; i < n; i++) {
      sum += f(a + i * h);
    }
    return h * sum;
  }

  public static double integrate() {
    double epsilon = 0.000001;
    int n = 2;
    while (Math.abs(integrate(2 * n) - integrate(n)) > epsilon) {
      n *= 2;
    }
    return integrate(2 * n);
  }
}
