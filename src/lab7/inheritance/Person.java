package lab7.inheritance;

import java.util.StringJoiner;

public class Person {

  private String name;
  private String address;

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("address='" + address + "'")
        .toString();
  }
}
