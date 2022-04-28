package lab6.classes.bouncingball;

/**
 * 1. More Exercises on Classes
 *
 * <p>1.6 Bouncing Balls - Ball and Container Classes
 */
public class Ball {

  private float x;
  private float y;
  private int radius;
  private float deltaX;
  private float deltaY;

  public Ball(float x, float y, int radius, int speed, int direction) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    deltaX = speed * (float) Math.cos(direction * Math.PI / 180);
    deltaY = speed * (float) Math.sin(direction * Math.PI / 180);
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
    return String.format("Ball[(%.2f, %.2f), speed=(%.2f, %.2f)]",
        x, y, deltaX, deltaY
    );
  }
}
