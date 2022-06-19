package lab7.composition;

import java.util.StringJoiner;

public class LineSub extends Point {

  Point end;

  public LineSub(int beginX, int beginY, int endX, int endY) {
    super(beginX, beginY);
    end = new Point(endX, endY);
  }

  public LineSub(Point begin, Point end) {
    super(begin.getX(), begin.getY());
    this.end = end;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", LineSub.class.getSimpleName() + "[", "]")
        .add("begin=" + super.toString())
        .add("end=" + end)
        .toString();
  }

  public Point getBegin() {
    return new Point(getX(), getY());
  }

  public Point getEnd() {
    return end;
  }

  public void setBegin(int x, int y) {
    setXY(x, y);
  }

  public void setEnd(int x, int y) {
    end.setXY(x, y);
  }

  public int getBeginX() {
    return getX();
  }

  public void setBeginX(int x) {
    setX(x);
  }

  public int getBeginY() {
    return getY();
  }

  public void setBeginY(int y) {
    setY(y);
  }

  public int getEndX() {
    return end.getX();
  }

  public void setEndX(int x) {
    end.setX(x);
  }

  public int getEndY() {
    return end.getY();
  }

  public void setEndY(int y) {
    end.setY(y);
  }

  public void setBeginXY(int x, int y) {
    setXY(x, y);
  }

  public void setEndXY(int x, int y) {
    end.setXY(x, y);
  }

  public double getLength() {
    return Math.sqrt(Math.pow(getBeginX() - getEndX(), 2) + Math.pow(getBeginY() - getEndY(), 2));
  }

  public double getGradient() {
    return Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX());
  }
}
