package lab8.polymorphism.resizable;

import java.util.StringJoiner;
import lab8.polymorphism.geometric.GeometricObject;

public class Circle implements GeometricObject {

  protected double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Circle.class.getSimpleName() + "[", "]")
        .add("radius=" + radius)
        .toString();
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }
}
