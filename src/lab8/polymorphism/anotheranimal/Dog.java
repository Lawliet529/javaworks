package lab8.polymorphism.anotheranimal;

public class Dog extends Animal {

  @Override
  public void greeting() {
    System.out.println("Woof!");
  }

  public void greeting(Dog another) {
    System.out.println("Woooooooooof!");
  }
}
