package lab6.classes;

/**
 * 1. More Exercises on Classes
 *
 * <p>1.5 The MyDate Class
 */
public class MyDate {

  public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                         "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
  public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
                                       "Thursday", "Friday", "Saturday"};
  public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30,
                                              31, 31, 30, 31, 30, 31};

  private int year;
  private int month;
  private int day;

  public MyDate(int year, int month, int day) {
    if (!(isValidDate(year, month, day))) {
      throw new IllegalStateException("Invalid date year, month or day.");
    }

    this.year = year;
    this.month = month;
    this.day = day;
  }

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0)
        || (year % 400 == 0);
  }

  public static boolean isValidDate(int year, int month, int day) {
    return (1 <= year && year <= 9999)
        && (1 <= month && month <= 12)
        && (1 <= day && day <= daysInMonth(year, month));
  }

  public static int getDayOfWeek(int year, int month, int day) {
    int dayOfWeek = 0;
    switch ((year / 100) % 4) {
      case 0:
        dayOfWeek += 6;
        break;
      case 1:
        dayOfWeek += 4;
        break;
      case 2:
        dayOfWeek += 2;
        break;
    }
    dayOfWeek += year % 100;
    dayOfWeek += (year % 100) / 4;
    switch (month) {
      case 1:
        dayOfWeek += (isLeapYear(year)) ? 6 : 0;
        break;
      case 2:
        dayOfWeek += (isLeapYear(year)) ? 2 : 3;
        break;
      case 3:
      case 11:
        dayOfWeek += 3;
        break;
      case 4:
      case 7:
        dayOfWeek += 6;
        break;
      case 5:
        dayOfWeek += 1;
        break;
      case 6:
        dayOfWeek += 4;
        break;
      case 8:
        dayOfWeek += 2;
        break;
      case 9:
      case 12:
        dayOfWeek += 5;
        break;
    }
    dayOfWeek += day;
    return dayOfWeek % 7;
  }

  public static int daysInMonth(int year, int month) {
    if (isLeapYear(year) && month == 2) {
      return 29;
    }

    return DAYS_IN_MONTHS[month - 1];
  }

  public void setDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s",
        DAYS[getDayOfWeek(year, month, day)],
        day,
        MONTHS[month - 1],
        year
    );
  }

  public MyDate nextDay() {
    if (day == daysInMonth(year, month)) {
      setDay(1);
      return nextMonth();
    }

    setDay(day + 1);
    return this;
  }

  public MyDate nextMonth() {
    if (month == 12) {
      setMonth(1);
      setDay(Math.min(day, 31));
      return nextYear();
    }

    setMonth(month + 1);
    setDay(Math.min(day, daysInMonth(year, month)));
    return this;
  }

  public MyDate nextYear() {
    if (year == 9999) {
      throw new IllegalStateException("Year out of range.");
    }

    setYear(year + 1);
    setDay(Math.min(day, daysInMonth(year, month)));
    return this;
  }

  public MyDate previousDay() {
    if (day == 1) {
      previousMonth();
      setDay(daysInMonth(year, month));
      return this;
    }

    setDay(day - 1);
    return this;
  }

  public MyDate previousMonth() {
    if (month == 1) {
      setMonth(12);
      setDay(Math.min(day, 31));
      return previousYear();
    }

    setMonth(month - 1);
    setDay(Math.min(day, daysInMonth(year, month)));
    return this;
  }

  public MyDate previousYear() {
    if (year == 1) {
      throw new IllegalStateException("Year out of range.");
    }

    setYear(year - 1);
    setDay(Math.min(day, daysInMonth(year, month)));
    return this;
  }
}
