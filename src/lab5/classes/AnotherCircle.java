package lab5.classes;

/**
 * 1. Exercises on Classes
 *
 * <p>1.2 Another Circle Class
 */
public class AnotherCircle {

  private double radius;

  public AnotherCircle() {
    radius = 1.0;
  }

  public AnotherCircle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }

  @Override
  public String toString() {
    return "AnotherCircle[" + "radius = " + radius + ']';
  }
}
