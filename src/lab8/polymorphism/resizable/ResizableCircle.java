package lab8.polymorphism.resizable;

import java.util.StringJoiner;

public class ResizableCircle extends Circle implements Resizable {

  public ResizableCircle(double radius) {
    super(radius);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ResizableCircle.class.getSimpleName() + "[", "]")
        .add(super.toString())
        .toString();
  }

  @Override
  public void resize(int percent) {
    radius *= percent / 100.0;
  }
}
