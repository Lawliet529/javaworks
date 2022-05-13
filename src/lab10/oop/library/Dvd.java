package lab10.oop.library;

import java.util.StringJoiner;

public class Dvd extends Item {

  int duration;

  public Dvd(String title, int year, int duration) {
    super(title, year);
    this.duration = duration;
  }

  public int getDuration() {
    return this.duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Dvd.class.getSimpleName() + "[", "]")
        .add("title='" + title + "'")
        .add("year=" + year)
        .add("duration=" + duration)
        .toString();
  }
}
