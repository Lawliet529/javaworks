package lab5.classes;

/**
 * 1. Exercises on Classes
 *
 * <p>1.4 The Employee Class
 */
public class Employee {

  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  public Employee(int id, String firstName, String lastName, int salary) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return firstName + ' ' + lastName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getAnnualSalary() {
    return 12 * salary;
  }

  public int raiseSalary(int percent) {
    salary = salary + salary * percent / 100;
    return salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name=" + '\'' + firstName + ' ' + lastName + '\'' +
        ", salary=" + salary +
        '}';
  }
}
