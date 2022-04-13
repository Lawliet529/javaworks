package lab5.composition;

import java.util.StringJoiner;

/**
 * 2. Exercises on Composition
 *
 * <p>2.1 An Introduction to OOP Composition by Example - the Author and Book Classes
 */
public class Author {

  private String name;
  private String email;
  private char gender;

  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public char getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Author.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("email='" + email + "'")
        .add("gender=" + gender)
        .toString();
  }
}
