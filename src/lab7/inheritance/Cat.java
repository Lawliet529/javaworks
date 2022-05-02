package lab7.inheritance;

import java.util.StringJoiner;

public class Cat extends Mammal {

  public Cat(String name) {
    super(name);
  }

  public void greets() {
    System.out.println("Meow");
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
        .add(super.toString())
        .toString();
  }
}
