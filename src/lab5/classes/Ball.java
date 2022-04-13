package lab5.classes;

/**
 * 1. Exercises on Classes
 *
 * <p>1.9 The Ball Class
 *
 * <p>Class Ball models a bouncing ball.
 */
public class Ball {

  private float x;
  private float y;
  private int radius;
  private float deltaX;
  private float deltaY;

  public Ball(float x, float y, int radius, float deltaX, float deltaY) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.deltaX = deltaX;
    this.deltaY = deltaY;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public float getDeltaX() {
    return deltaX;
  }

  public void setDeltaX(float deltaX) {
    this.deltaX = deltaX;
  }

  public float getDeltaY() {
    return deltaY;
  }

  public void setDeltaY(float deltaY) {
    this.deltaY = deltaY;
  }

  public void move() {
    x += deltaX;
    y += deltaY;
  }

  public void reflectHorizontal() {
    deltaX = -deltaX;
  }

  public void reflectVertical() {
    deltaY = -deltaY;
  }

  @Override
  public String toString() {
    return "Ball{" +
        "(" + x + "," + y + ")" +
        ", speed=(" + deltaX + "," + deltaY +
        ")}";
  }
}
