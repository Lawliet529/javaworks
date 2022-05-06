package lab9;

public class Movie implements Comparable<Movie> {

  private String name;
  private double rating;
  private int year;

  public Movie(String name, double rating, int year) {
    this.name = name;
    this.rating = rating;
    this.year = year;
  }

  @Override
  public int compareTo(Movie movie) {
    return getYear() - movie.getYear();
  }

  public String getName() {
    return name;
  }

  public double getRating() {
    return rating;
  }

  public int getYear() {
    return year;
  }
}
