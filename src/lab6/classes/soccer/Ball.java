package lab6.classes.soccer;

/**
 * 1. More Exercises on Classes
 *
 * <p>1.7 The Ball and Player Classes
 */
public class Ball {

  private float x;
  private float y;
  private float z;

  public Ball(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }

  public float getZ() {
    return z;
  }

  public void setXYZ(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public String toString() {
    return String.format("(%.2f, %.2f, %.2f)", x, y, z);
  }
}
