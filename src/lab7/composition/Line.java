package lab7.composition;

import java.util.StringJoiner;

public class Line {

  private Point begin;
  private Point end;

  public Line(Point begin, Point end) {
    this.begin = begin;
    this.end = end;
  }

  public Line(int beginX, int beginY, int endX, int endY) {
    begin = new Point(beginX, beginY);
    end = new Point(endX, endY);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Line.class.getSimpleName() + "[", "]")
        .add("begin=" + begin)
        .add("end=" + end)
        .toString();
  }

  public Point getBegin() {
    return begin;
  }

  public void setBegin(Point begin) {
    this.begin = begin;
  }

  public Point getEnd() {
    return end;
  }

  public void setEnd(Point end) {
    this.end = end;
  }

  public int getBeginX() {
    return begin.getX();
  }

  public void setBeginX(int x) {
    begin.setX(x);
  }

  public int getBeginY() {
    return begin.getY();
  }

  public void setBeginY(int y) {
    begin.setY(y);
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
    begin.setXY(x, y);
  }

  public void setEndXY(int x, int y) {
    end.setXY(x, y);
  }

  public double getLength() {
    return Math.sqrt(
        Math.pow(getBeginX() - getEndX(), 2)
            + Math.pow(getBeginY() - getEndY(), 2)
    );
  }

  public double getGradient() {
    return Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX());
  }
}
