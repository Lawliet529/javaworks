package lab5.composition.invoice;

/**
 * 2. Exercises on Composition
 *
 * <p>2.4 The Customer and Invoice classes
 */
public class Customer {

  private int id;
  private String name;
  private int discount;

  public Customer(int id, String name, int discount) {
    this.id = id;
    this.name = name;
    this.discount = discount;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  @Override
  public String toString() {
    return String.format("%s(%s)(%d%%)", name, id, discount);
  }
}
