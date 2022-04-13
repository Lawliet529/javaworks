package lab5.composition;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * 2. Exercises on Composition
 *
 * <p>2.1 An Introduction to OOP Composition by Example - the Author and Book Classes
 *
 * <p>2.2 (Advanced) The Author and Book Classes Again - An Array of Objects as an Instance
 * Variable
 */
public class Book {

  private String name;
  private Author[] authors;
  private double price;
  private int qty;

  public Book(String name, Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    qty = 0;
  }

  public Book(String name, Author[] authors, double price, int qty) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public Author[] getAuthors() {
    return authors;
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

  @Override
  public String toString() {
    return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("author=" + Arrays.toString(authors))
        .add("price=" + price)
        .add("qty=" + qty)
        .toString();
  }
}
