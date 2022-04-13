package lab5.composition.account;

/**
 * 2. Exercises on Composition
 *
 * <p>2.5 The Customer and Account classes
 */
public class Customer {

  private int id;
  private String name;
  private char gender;

  public Customer(int id, String name, char gender) {
    this.id = id;
    this.name = name;
    this.gender = gender;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public char getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return String.format("%s(%d)", name, id);
  }
}
