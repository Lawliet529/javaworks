package lab10.oop.library;

import java.util.Date;
import java.util.StringJoiner;

public class Rent {

  Item item;
  Student student;
  Date begin;
  Date end;

  public Rent(Item item, Student student, Date begin, Date end) {
    this.item = item;
    this.student = student;
    this.begin = begin;
    this.end = end;
  }

  public Item getItem() {
    return this.item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public Student getStudent() {
    return this.student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Date getBegin() {
    return this.begin;
  }

  public void setBegin(Date begin) {
    this.begin = begin;
  }

  public Date getEnd() {
    return this.end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Rent.class.getSimpleName() + "[", "]")
        .add("item=" + item)
        .add("student=" + student)
        .add("begin=" + begin)
        .add("end=" + end)
        .toString();
  }
}
