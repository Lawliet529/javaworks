package lab8.polymorphism.movable;

import java.util.StringJoiner;

public class MovableCircle implements Movable {

  private MovablePoint center;
  private int radius;

  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ")
        .add(center.toString())
        .add("radius=" + radius)
        .toString();
  }

  @Override
  public void moveUp() {
    center.moveUp();
  }

  @Override
  public void moveDown() {
    center.moveDown();
  }

  @Override
  public void moveLeft() {
    center.moveLeft();
  }

  @Override
  public void moveRight() {
    center.moveRight();
  }
}
