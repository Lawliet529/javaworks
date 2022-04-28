package lab6.classes.soccer;

/**
 * 1. More Exercises on Classes
 *
 * <p>1.7 The Ball and Player Classes
 */
public class Player {

  private int number;
  private float x;
  private float y;
  private float z = 0.0f;

  public Player(int number, float x, float y) {
    this.number = number;
    this.x = x;
    this.y = y;
  }

  public void move(float xDisp, float yDisp) {
    x += xDisp;
    y += yDisp;
  }

  public void jump(float zDisp) {
    z += zDisp;
    z = 0;
  }

  public boolean near(Ball ball) {
    return Math.sqrt(Math.pow(x - ball.getX(), 2) + Math.pow(y - ball.getY(), 2)) < 8;
  }

  public void kick(Ball ball) {
    if (near(ball)) {
      float xDiff = ball.getX() - x;
      float yDiff = ball.getY() - y;
      float direction = (float) Math.atan(yDiff / xDiff);

      // Assume the ball flies a distance of 10
      float xDisp = 10 * (float) Math.cos(direction);
      float yDisp = 10 * (float) Math.sin(direction);
      ball.setXYZ(
          ball.getX() + xDisp,
          ball.getY() + yDisp,
          0
      );
    }
  }
}
