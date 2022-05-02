package lab8.polymorphism.anotheranimal;

class AnimalTest {

  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.greeting();
    Dog dog1 = new Dog();
    dog1.greeting();
    BigDog bigDog1 = new BigDog();
    bigDog1.greeting();

    Animal animal1 = new Cat();
    animal1.greeting();
    Dog animal2 = new Dog();
    animal2.greeting();
    BigDog animal3 = new BigDog();
    animal3.greeting();

    ((Dog) animal3).greeting(animal3);
    ((Dog) animal3).greeting(animal2);
    animal2.greeting(animal3);
    animal3.greeting(animal2);
    animal3.greeting(bigDog1);
  }
}
