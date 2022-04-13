package lab5.classes;

class AccountTest {

  public static void main(String[] args) {
    Account account1 = new Account("A101", "Tan Ah Teck", 88);
    System.out.println(account1);
    Account account2 = new Account("A102", "Kumar");
    System.out.println(account2);

    System.out.println("ID: " + account1.getId());
    System.out.println("Name: " + account1.getName());
    System.out.println("Balance: " + account1.getBalance());

    System.out.println(account1.credit(100));
    System.out.println(account1.debit(50));
    try {
      System.out.println(account1.debit(500));
    } catch (ArithmeticException e) {
      System.out.println("Amount exceeded balance.");
    }

    System.out.println(account1.transferTo(account2, 100));
    System.out.println(account2);
  }
}
