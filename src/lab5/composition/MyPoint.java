package lab5.composition;

/**
 * 2. Exercises on Composition
 *
 * <p>2.6 The MyPoint Class
 */
public class MyPoint {

  private int x;
  private int y;

  public MyPoint() {
    x = 0;
    y = 0;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int[] getXY() {
    return new int[] {x, y};
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("(%d, %d)", x, y);
  }

  public double distance(int x, int y) {
    double dx = this.x - x;
    double dy = this.y - y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public double distance(MyPoint another) {
    return distance(another.x, another.y);
  }

  public double distance() {
    return Math.sqrt(x * x + y * y);
  }
}
