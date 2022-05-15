package lab10.collections.phonebook;

import java.util.StringJoiner;

public class Student {

  private String firstName;
  private String lastName;
  private String number;

  public Student(String firstName, String lastName, String number) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.number = number;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
        .add("name='" + getName() + "'")
        .add("number=" + number)
        .toString();
  }
}
