package lab5.classes;

/**
 * 1. Exercises on Classes
 *
 * <p>1.1 An Introduction to Classes and Instances by Example - The Circle Class
 *
 * <p>The Circle class models a circle with a radius and color.
 */
public class Circle {

  private double radius;
  private String color;

  /**
   * Constructs a Circle instance with the default value for radius and color.
   */
  public Circle() {
    radius = 1.0;
    color = "red";
  }

  /**
   * Constructs a Circle instance with the given radius and default color.
   *
   * @param radius radius for circle.
   */
  public Circle(double radius) {
    this.radius = radius;
    color = "red";
  }

  /**
   * Constructs a Circle instance with given radius and color.
   *
   * @param radius radius for circle.
   * @param color  color for circle.
   */
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  /**
   * Returns the radius.
   */
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Returns the area of this Circle instance.
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Circle[" + "radius = " + radius + ", color = " + color + "]";
  }
}
