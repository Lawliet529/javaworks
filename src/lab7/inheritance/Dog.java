package lab7.inheritance;

import java.util.StringJoiner;

public class Dog extends Mammal {

  public Dog(String name) {
    super(name);
  }

  public void greets() {
    System.out.println("Woof");
  }

  public void greets(Dog another) {
    System.out.println("Woooof");
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Dog.class.getSimpleName() + "[", "]")
        .add(super.toString())
        .toString();
  }
}
