package lab7.inheritance;

import java.util.StringJoiner;

public class Staff extends Person {

  private String school;
  private double pay;

  public Staff(String name, String address, String school, double pay) {
    super(name, address);
    this.school = school;
    this.pay = pay;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public double getPay() {
    return pay;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Staff.class.getSimpleName() + "[", "]")
        .add(super.toString())
        .add("school='" + school + "'")
        .add("pay=" + pay)
        .toString();
  }
}
