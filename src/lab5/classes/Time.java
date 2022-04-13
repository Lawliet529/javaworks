package lab5.classes;

/**
 * 1. Exercises on Classes
 *
 * <p>1.8 The Time Class
 */
public class Time {

  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  public Time nextSecond() {
    if (second != 59) {
      setSecond(second + 1);
      return this;
    }

    if (minute != 59) {
      setTime(hour, minute + 1, 0);
      return this;
    }

    if (hour != 23) {
      setTime(hour + 1, 0, 0);
      return this;
    }

    setTime(0, 0, 0);
    return this;
  }

  public Time previousSecond() {
    if (second != 0) {
      setSecond(second - 1);
      return this;
    }

    if (minute != 0) {
      setTime(hour, minute - 1, 59);
      return this;
    }

    if (hour != 0) {
      setTime(hour - 1, 59, 59);
      return this;
    }

    setTime(23, 59, 59);
    return this;
  }
}
