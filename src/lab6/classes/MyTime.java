package lab6.classes;

/**
 * 1. More Exercises on Classes
 *
 * <p>1.4 The MyTime Class
 */
public class MyTime {

  private int hour;
  private int minute;
  private int second;

  public MyTime() {
    hour = 0;
    minute = 0;
    second = 0;
  }

  public MyTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
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

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  public MyTime nextSecond() {
    if (second == 59) {
      setSecond(0);
      return nextMinute();
    }

    setSecond(second + 1);
    return this;
  }

  public MyTime nextMinute() {
    if (minute == 59) {
      setMinute(0);
      return nextHour();
    }

    setMinute(minute + 1);
    return this;
  }

  public MyTime nextHour() {
    if (hour == 23) {
      setHour(0);
      return this;
    }

    setHour(hour + 1);
    return this;
  }

  public MyTime previousSecond() {
    if (second == 0) {
      setSecond(59);
      return previousMinute();
    }

    setSecond(second - 1);
    return this;
  }

  public MyTime previousMinute() {
    if (minute == 0) {
      setMinute(59);
      return previousHour();
    }

    setMinute(minute - 1);
    return this;
  }

  public MyTime previousHour() {
    if (hour == 0) {
      setHour(23);
      return this;
    }

    setHour(hour - 1);
    return this;
  }
}
