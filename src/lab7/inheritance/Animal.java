package lab7.inheritance;

import java.util.StringJoiner;

public class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Animal.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .toString();
  }
}
