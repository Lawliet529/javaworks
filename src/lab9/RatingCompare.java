package lab9;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

  @Override
  public int compare(Movie o1, Movie o2) {
    int rating1 = (int) Math.round(o1.getRating() * 100);
    int rating2 = (int) Math.round(o2.getRating() * 100);
    return rating1 - rating2;
  }
}
