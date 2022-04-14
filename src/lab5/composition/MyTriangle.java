package lab5.composition;

import java.util.StringJoiner;

/**
 * 2. Exercises on Composition
 *
 * <p>2.9 The MyTriangle and MyPoint Classes
 */
public class MyTriangle {

  private MyPoint v1;
  private MyPoint v2;
  private MyPoint v3;

  public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    v1 = new MyPoint(x1, y1);
    v2 = new MyPoint(x2, y2);
    v3 = new MyPoint(x3, y3);
  }

  public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", MyTriangle.class.getSimpleName() + "[", "]")
        .add("v1=" + v1)
        .add("v2=" + v2)
        .add("v3=" + v3)
        .toString();
  }

  public double getPerimeter() {
    MyLine edge1 = new MyLine(v1, v2);
    MyLine edge2 = new MyLine(v2, v3);
    MyLine edge3 = new MyLine(v3, v1);
    return edge1.getLength() + edge2.getLength() + edge3.getLength();
  }

  public String getType() {
    MyLine edge1 = new MyLine(v1, v2);
    MyLine edge2 = new MyLine(v2, v3);
    MyLine edge3 = new MyLine(v3, v1);

    if (edge1.getLength() == edge2.getLength()
        && edge2.getLength() == edge3.getLength()) {
      return "Equilateral";
    }

    if (edge1.getLength() == edge2.getLength()
        || edge2.getLength() == edge3.getLength()
        || edge3.getLength() == edge1.getLength()) {
      return "Isosceles";
    }

    return "Scalene";
  }
}
