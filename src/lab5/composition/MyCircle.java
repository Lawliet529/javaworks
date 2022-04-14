package lab5.composition;

import java.util.StringJoiner;

/**
 * 2. Exercises on Composition
 *
 * <p>2.8 The MyCircle and MyPoint Classes
 */
public class MyCircle {

  private MyPoint center;
  private int radius;

  public MyCircle() {
    center = new MyPoint(0, 0);
    radius = 1;
  }

  public MyCircle(int x, int y, int radius) {
    center = new MyPoint(x, y);
    this.radius = radius;
  }

  public MyCircle(MyPoint center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public MyPoint getCenter() {
    return center;
  }

  public void setCenter(MyPoint center) {
    this.center = center;
  }

  public int getCenterX() {
    return center.getX();
  }

  public void setCenterX(int x) {
    center.setX(x);
  }

  public int getCenterY() {
    return center.getY();
  }

  public void setCenterY(int y) {
    center.setY(y);
  }

  public int[] getCenterXY() {
    return new int[]{getCenterX(), getCenterY()};
  }

  public void setCenterXY(int x, int y) {
    center.setXY(x, y);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", MyCircle.class.getSimpleName() + "[", "]")
        .add("center=" + center)
        .add("radius=" + radius)
        .toString();
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }

  /**
   * Returns the distance of the centers from this MyCircle instance and the given MyCircle
   * instance.
   *
   * @param another another MyCircle instance.
   */
  public double distance(MyCircle another) {
    return center.distance(another.center);
  }
}
