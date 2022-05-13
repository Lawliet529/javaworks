package lab10.oop.library;

import java.time.Duration;
import java.util.Date;

public class Library {

  Rent[] rents;

  public Library(Rent[] rents) {
    this.rents = rents;
  }

  public Rent getLongestRent() {
    int maxIndex = 0;
    long maxDays = 0;

    for (int i = 0; i < rents.length; i++) {
      Date begin = rents[i].getBegin();
      Date end = rents[i].getEnd();
      long daysBetween = Duration.between(begin.toInstant(), end.toInstant()).toDays();
      if (daysBetween > maxDays) {
        maxIndex = i;
        maxDays = daysBetween;
      }
    }

    return rents[maxIndex];
  }
}
