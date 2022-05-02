package lab7.inheritance;

import java.util.StringJoiner;

public class Cylinder extends Circle {

  private double height;

  public Cylinder() {
    super();
    height = 1.0;
  }

  public Cylinder(double radius) {
    super(radius);
    height = 1.0;
  }

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  public Cylinder(double radius, double height, String color) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return super.getArea() * height;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Cylinder.class.getSimpleName() + "[", "]")
        .add(super.toString())
        .add("height=" + height)
        .toString();
  }
}
