package lab5.classes;

/**
 * 1. Exercises on Classes
 *
 * <p>1.6 The Account Class
 *
 * <p>Class Account models a bank account of a customer.
 */
public class Account {

  private String id;
  private String name;
  private int balance;

  public Account(String id, String name) {
    this.id = id;
    this.name = name;
    balance = 0;
  }

  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public int credit(int amount) {
    balance += amount;
    return balance;
  }

  public int debit(int amount) {
    if (amount > balance) {
      throw new ArithmeticException("Amount exceeded balance.");
    }

    balance -= amount;
    return balance;
  }

  public int transferTo(Account another, int amount) {
    if (amount > balance) {
      throw new ArithmeticException("Amount exceeded balance.");
    }

    balance -= amount;
    another.credit(amount);
    return balance;
  }

  @Override
  public String toString() {
    return "Account{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", balance=" + balance +
        '}';
  }
}
