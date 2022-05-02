package lab7.composition;

import java.util.StringJoiner;
import lab7.inheritance.Circle;

public class Cylinder {

  private Circle base;
  private double height;

  public Cylinder() {
    base = new Circle();
    height = 1.0;
  }

  public Cylinder(Circle base, double height) {
    this.base = base;
    this.height = height;
  }

  public Cylinder(double radius, double height) {
    base = new Circle(radius);
    this.height = height;
  }

  public Cylinder(double radius, double height, String color) {
    base = new Circle(radius, color);
    this.height = height;
  }

  public Circle getBase() {
    return base;
  }

  public void setBase(Circle base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getRadius() {
    return base.getRadius();
  }

  public void setRadius(double radius) {
    base.setRadius(radius);
  }

  public String getColor() {
    return base.getColor();
  }

  public void setColor(String color) {
    base.setColor(color);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Cylinder.class.getSimpleName() + "[", "]")
        .add("base=" + base)
        .add("height=" + height)
        .toString();
  }
}
