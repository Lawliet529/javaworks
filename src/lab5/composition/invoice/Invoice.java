package lab5.composition.invoice;

import java.util.StringJoiner;

/**
 * 2. Exercises on Composition
 *
 * <p>2.4 The Customer and Invoice classes
 */
public class Invoice {

  private int id;
  private Customer customer;
  private double amount;

  public Invoice(int id, Customer customer, double amount) {
    this.id = id;
    this.customer = customer;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public int getCustomerID() {
    return customer.getId();
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public int getCustomerDiscount() {
    return customer.getDiscount();
  }

  public double getAmountAfterDiscount() {
    return amount - amount * getCustomerDiscount() / 100;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Invoice.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .add("customer=" + customer)
        .add("amount=" + amount)
        .toString();
  }
}
