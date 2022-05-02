package lab8.polymorphism.geometric;

import java.util.StringJoiner;

public class Rectangle implements GeometricObject {

  private double width;
  private double length;

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Rectangle.class.getSimpleName() + "[", "]")
        .add("width=" + width)
        .add("length=" + length)
        .toString();
  }

  @Override
  public double getArea() {
    return width * length;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + length);
  }
}
