package lab10.oop.library;

import java.util.StringJoiner;

public abstract class Item {

  String title;
  int year;

  public Item(String title, int year) {
    this.title = title;
    this.year = year;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
        .add("title='" + title + "'")
        .add("year=" + year)
        .toString();
  }
}
