package lab5.composition;

import java.util.StringJoiner;

/**
 * 2. Exercises on Composition
 *
 * <p>2.10 The MyRectangle and MyPoint Classes
 *
 * <p>Class MyRectangle models a rectangle from two given points.
 */
public class MyRectangle {

  private MyPoint vertex1;
  private MyPoint vertex2;

  public MyRectangle(MyPoint vertex1, MyPoint vertex2) {
    this.vertex1 = vertex1;
    this.vertex2 = vertex2;
  }

  public MyRectangle(int x1, int y1, int x2, int y2) {
    vertex1 = new MyPoint(x1, y1);
    vertex2 = new MyPoint(x2, y2);
  }

  public MyPoint getVertex1() {
    return vertex1;
  }

  public void setVertex1(MyPoint vertex1) {
    this.vertex1 = vertex1;
  }

  public void setVertex1(int x, int y) {
    vertex1.setXY(x, y);
  }

  public MyPoint getVertex2() {
    return vertex2;
  }

  public void setVertex2(MyPoint vertex2) {
    this.vertex2 = vertex2;
  }

  public void setVertex2(int x, int y) {
    vertex2.setXY(x, y);
  }

  public double length() {
    return Math.abs(vertex1.getX() - vertex2.getX());
  }

  public double width() {
    return Math.abs(vertex1.getY() - vertex2.getY());
  }

  public double perimeter() {
    return 2 * (length() + width());
  }

  public double area() {
    return length() * width();
  }

  public boolean isSquare() {
    return length() == width();
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", MyRectangle.class.getSimpleName() + "[", "]")
        .add(vertex1.toString())
        .add(vertex2.toString())
        .toString();
  }
}
