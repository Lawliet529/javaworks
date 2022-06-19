package lab10.collections.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {

  HashMap<String, Student> phoneBook;

  public PhoneBookMap() {}

  @Override
  public Student searchByLastName(String s) {
    return phoneBook.values().stream()
        .filter(student -> student.getLastName().equals(s))
        .findFirst()
        .orElse(null);
  }

  @Override
  public Student searchByNumber(String number) {
    return phoneBook.get(number);
  }

  @Override
  public Student searchByName(String s) {
    return phoneBook.values().stream()
        .filter(student -> student.getName().equals(s))
        .findFirst()
        .orElse(null);
  }

  @Override
  public void addPerson(Student student) {
    phoneBook.put(student.getNumber(), student);
  }

  @Override
  public void deleteByNumber(String number) {
    phoneBook.remove(number);
  }
}
