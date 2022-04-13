package lab5.composition.account;

/**
 * 2. Exercises on Composition
 *
 * <p>2.5 The Customer and Account classes
 */
public class Account {

  private int id;
  private Customer customer;
  private double balance;

  public Account(int id, Customer customer, double balance) {
    this.id = id;
    this.customer = customer;
    this.balance = balance;
  }

  public Account(int id, Customer customer) {
    this.id = id;
    this.customer = customer;
    balance = 0.0;
  }

  public int getId() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return String.format("%s balance=$%.2f", customer, balance);
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public Account deposit(double amount) {
    balance += amount;
    return this;
  }

  public Account withdraw(double amount) {
    if (amount > balance) {
      throw new ArithmeticException("amount withdrawn exceeds the current balance.");
    }

    balance -= amount;
    return this;
  }
}
