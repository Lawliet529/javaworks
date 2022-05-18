package lab10.collections.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {

  ArrayList<Student> phoneBook;

  public PhoneBookList() {
  }

  @Override
  public Student searchByLastName(String s) {
    return phoneBook.stream().filter(student -> student.getLastName().equals(s))
        .findFirst().orElse(null);
  }

  @Override
  public Student searchByNumber(String number) {
    return phoneBook.stream().filter(student -> student.getNumber().equals(number))
        .findFirst().orElse(null);
  }

  @Override
  public Student searchByName(String s) {
    return phoneBook.stream().filter(student -> student.getName().equals(s))
        .findFirst().orElse(null);
  }

  @Override
  public void addPerson(Student student) {
    phoneBook.add(student);
  }

  @Override
  public void deleteByNumber(String number) {
    phoneBook.removeIf(student -> student.getNumber().equals(number));
  }
}
