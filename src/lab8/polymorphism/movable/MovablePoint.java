package lab8.polymorphism.movable;

import java.util.StringJoiner;

public class MovablePoint implements Movable {

  int x;
  int y;
  int xSpeed;
  int ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ")
        .add("(" + x)
        .add(y + ")")
        .add(" speed=(" + xSpeed)
        .add(ySpeed + ")")
        .toString();
  }

  @Override
  public void moveUp() {
    y += ySpeed;
  }

  @Override
  public void moveDown() {
    y -= ySpeed;
  }

  @Override
  public void moveLeft() {
    x -= xSpeed;
  }

  @Override
  public void moveRight() {
    x += xSpeed;
  }
}
