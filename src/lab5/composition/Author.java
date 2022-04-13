package lab5.composition;

import java.util.StringJoiner;

/**
 * 2. Exercises on Composition
 *
 * <p>2.3 The Author and Book Classes - Your Turn
 */
public class Author {

  private String name;
  private String email;

  public Author(String name, String email) {
    this.name = name;
    this.email = email;
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

  @Override
  public String toString() {
    return new StringJoiner(", ", Author.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("email='" + email + "'")
        .toString();
  }
}
