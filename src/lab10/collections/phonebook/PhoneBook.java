package lab10.collections.phonebook;

public interface PhoneBook {

  Student searchByLastName(String s);

  Student searchByNumber(String number);

  Student searchByName(String s);

  void addPerson(Student student);

  void deleteByNumber(String number);
}
