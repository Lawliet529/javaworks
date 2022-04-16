package lab4.more;

/**
 * 1. More Exercises
 *
 * <p>1.9. DateUtil
 */
public class DateUtil {

  // Month's name - for printing
  public static String[] strMonths = {
      "Jan", "Feb", "Mar", "Apr", "May", "Jun",
      "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
  };

  // Number of days in each month (for non-leap years)
  public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public static void main(String[] args) {
    System.out.println(isLeapYear(1900)); // false
    System.out.println(isLeapYear(2000)); // true
    System.out.println(isLeapYear(2011)); // false
    System.out.println(isLeapYear(2012)); // true

    System.out.println(isValidDate(2012, 2, 29)); // true
    System.out.println(isValidDate(2011, 2, 29)); // false
    System.out.println(isValidDate(2099, 12, 31)); // true
    System.out.println(isValidDate(2099, 12, 32)); // false

    System.out.println(getDayOfWeek(1982, 4, 24)); // 6:Sat
    System.out.println(getDayOfWeek(2000, 1, 1)); // 6:Sat
    System.out.println(getDayOfWeek(2054, 6, 19)); // 5:Fri
    System.out.println(getDayOfWeek(2012, 2, 17)); // 5:Fri

    System.out.println(printDate(2012, 2, 14)); // Tuesday 14 Feb 2012
  }

  // Returns true if the given year is a leap year
  public static boolean isLeapYear(int year) {
    return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
  }

  // Return true if the given year, month, day is a valid date
  // year: 1-9999
  // month: 1(Jan) - 12(Dec)
  // day: 1 − 28|29|30|31. The last day depends on year and month
  public static boolean isValidDate(int year, int month, int day) {
    boolean isValidYear = 1 <= year && year <= 9999;
    boolean isValidMonth = 1 <= month && month <= 12;
    boolean isValidDay;
    if (isLeapYear(year) && month == 2) {
      isValidDay = 1 <= day && day <= 29;
    } else {
      isValidDay = 1 <= day && day <= daysInMonths[month - 1];
    }
    return isValidYear && isValidMonth && isValidDay;
  }

  // Return the day of the week, 0:Sun, 1:Mon, ..., 6:Sat
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

  // Returns String "xxxday d mmm yyyy" (e.g., Wednesday 29 Feb 2012)
  public static String printDate(int year, int month, int day) {
    String dayOfWeek;
    switch (getDayOfWeek(year, month, day)) {
      case 0:
        dayOfWeek = "Sunday";
        break;
      case 1:
        dayOfWeek = "Monday";
        break;
      case 2:
        dayOfWeek = "Tuesday";
        break;
      case 3:
        dayOfWeek = "Wednesday";
        break;
      case 4:
        dayOfWeek = "Thursday";
        break;
      case 5:
        dayOfWeek = "Friday";
        break;
      case 6:
        dayOfWeek = "Saturday";
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + getDayOfWeek(year, month, day));
    }
    return dayOfWeek + " " + day + " " + strMonths[month - 1] + " " + year;
  }
}
