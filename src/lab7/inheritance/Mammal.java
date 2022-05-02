package lab7.inheritance;

import java.util.StringJoiner;

public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Mammal.class.getSimpleName() + "[", "]")
        .add(super.toString())
        .toString();
  }
}
