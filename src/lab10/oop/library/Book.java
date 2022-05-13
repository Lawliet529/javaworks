package lab10.oop.library;

import java.util.StringJoiner;

public class Book extends Item {

  int pages;

  public Book(String title, int year, int pages) {
    super(title, year);
    this.pages = pages;
  }

  public int getPages() {
    return this.pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
        .add("title='" + title + "'")
        .add("year=" + year)
        .add("pages=" + pages)
        .toString();
  }
}
