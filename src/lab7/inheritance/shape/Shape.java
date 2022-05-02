package lab7.inheritance.shape;

import java.util.StringJoiner;

public class Shape {

  private String color;
  private boolean filled;

  public Shape() {
    color = "red";
    filled = true;
  }

  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Shape.class.getSimpleName() + "[", "]")
        .add("color='" + color + "'")
        .add("filled=" + filled)
        .toString();
  }
}
