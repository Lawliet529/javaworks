package lab8.polymorphism.shape;

import java.util.StringJoiner;

public class Square extends Rectangle {

  public Square() {
    super();
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  public double getSide() {
    return length;
  }

  public void setSide(double side) {
    setWidth(side);
    setLength(side);
  }

  @Override
  public void setWidth(double side) {
    super.setWidth(side);
  }

  @Override
  public void setLength(double side) {
    super.setLength(side);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Square.class.getSimpleName() + "[", "]")
        .add(super.toString())
        .toString();
  }
}
