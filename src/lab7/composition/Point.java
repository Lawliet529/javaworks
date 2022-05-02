package lab7.composition;

import java.util.StringJoiner;

public class Point {

  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", "(", ")")
        .add("" + x)
        .add("" + y)
        .toString();
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

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
