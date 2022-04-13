package lab5.composition;

import java.util.StringJoiner;

/**
 * 2. Exercises on Composition
 *
 * <p>2.1 An Introduction to OOP Composition by Example - the Author and Book Classes
 */
public class Book {

  private String name;
  private Author author;
  private double price;
  private int qty;

  public Book(String name, Author author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
    qty = 0;
  }

  public Book(String name, Author author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public Author getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String getAuthorName() {
    return author.getName();
  }

  public String getAuthorEmail() {
    return author.getEmail();
  }

  public char getAuthorGender() {
    return author.getGender();
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("author=" + author)
        .add("price=" + price)
        .add("qty=" + qty)
        .toString();
  }
}
