package lab8.polymorphism.animal;

public abstract class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public abstract void greets();

  public String toString() {
    return name;
  }
}
