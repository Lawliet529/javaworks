package com.countrylistmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListManager {

  // Singleton pattern
  private static CountryListManager instance;

  private List<AbstractCountry> countryList;

  private CountryListManager() {
    countryList = new LinkedList<>();
  }

  public static CountryListManager getInstance() {
    if (instance == null) {
      instance = new CountryListManager();
    }
    return instance;
  }

  public List<AbstractCountry> getCountryList() {
    return countryList;
  }

  public void append(AbstractCountry country) {
    countryList.add(country);
  }

  public void add(AbstractCountry country, int index) {
    countryList.add(index, country);
  }

  public void remove(int index) {
    countryList.remove(index);
  }

  public void remove(AbstractCountry country) {
    countryList.remove(country);
  }

  public AbstractCountry countryAt(int index) {
    return countryList.get(index);
  }

  public List<AbstractCountry> sortIncreasingByPopulation() {
    List<AbstractCountry> newList = new LinkedList<>(this.countryList);
    Collections.sort(
        newList,
        new Comparator<AbstractCountry>() {
          @Override
          public int compare(AbstractCountry left, AbstractCountry right) {
            return left.getPopulation() - right.getPopulation();
          }
        });
    return newList;
  }

  public List<AbstractCountry> sortDecreasingByPopulation() {
    List<AbstractCountry> newList = new LinkedList<>(this.countryList);
    Collections.sort(
        newList,
        new Comparator<AbstractCountry>() {
          @Override
          public int compare(AbstractCountry left, AbstractCountry right) {
            return right.getPopulation() - left.getPopulation();
          }
        });
    return newList;
  }

  public List<AbstractCountry> sortIncreasingByArea() {
    List<AbstractCountry> newList = new LinkedList<>(this.countryList);
    Collections.sort(
        newList,
        new Comparator<AbstractCountry>() {
          @Override
          public int compare(AbstractCountry left, AbstractCountry right) {
            return Double.compare(left.getArea(), right.getArea());
          }
        });
    return newList;
  }

  public List<AbstractCountry> sortDecreasingByArea() {
    List<AbstractCountry> newList = new LinkedList<>(this.countryList);
    Collections.sort(
        newList,
        new Comparator<AbstractCountry>() {
          @Override
          public int compare(AbstractCountry left, AbstractCountry right) {
            return Double.compare(right.getArea(), left.getArea());
          }
        });
    return newList;
  }

  public List<AbstractCountry> sortIncreasingByGdp() {
    List<AbstractCountry> newList = new LinkedList<>(this.countryList);
    Collections.sort(
        newList,
        new Comparator<AbstractCountry>() {
          @Override
          public int compare(AbstractCountry left, AbstractCountry right) {
            return Double.compare(left.getGdp(), right.getGdp());
          }
        });
    return newList;
  }

  public List<AbstractCountry> sortDecreasingByGdp() {
    List<AbstractCountry> newList = new LinkedList<>(this.countryList);
    Collections.sort(
        newList,
        new Comparator<AbstractCountry>() {
          @Override
          public int compare(AbstractCountry left, AbstractCountry right) {
            return Double.compare(right.getGdp(), left.getGdp());
          }
        });
    return newList;
  }

  public List<AbstractCountry> filterContinent(String continent) {
    List<AbstractCountry> newList = new LinkedList<>();
    for (AbstractCountry country : countryList) {
      if (country.getClass().getSimpleName().contains(continent)) {
        newList.add(country);
      }
    }
    return newList;
  }

  public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
    List<AbstractCountry> newList = new LinkedList<>();
    List<AbstractCountry> sortedList = sortDecreasingByPopulation();
    for (int i = 0; i < howMany; i++) {
      newList.add(sortedList.get(i));
    }
    return newList;
  }

  public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
    List<AbstractCountry> newList = new LinkedList<>();
    List<AbstractCountry> sortedList = sortIncreasingByPopulation();
    for (int i = 0; i < howMany; i++) {
      newList.add(sortedList.get(i));
    }
    return newList;
  }

  public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
    List<AbstractCountry> newList = new LinkedList<>();
    List<AbstractCountry> sortedList = sortDecreasingByArea();
    for (int i = 0; i < howMany; i++) {
      newList.add(sortedList.get(i));
    }
    return newList;
  }

  public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
    List<AbstractCountry> newList = new LinkedList<>();
    List<AbstractCountry> sortedList = sortIncreasingByArea();
    for (int i = 0; i < howMany; i++) {
      newList.add(sortedList.get(i));
    }
    return newList;
  }

  public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
    List<AbstractCountry> newList = new LinkedList<>();
    List<AbstractCountry> sortedList = sortDecreasingByGdp();
    for (int i = 0; i < howMany; i++) {
      newList.add(sortedList.get(i));
    }
    return newList;
  }

  public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
    List<AbstractCountry> newList = new LinkedList<>();
    List<AbstractCountry> sortedList = sortIncreasingByArea();
    for (int i = 0; i < howMany; i++) {
      newList.add(sortedList.get(i));
    }
    return newList;
  }

  public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
    StringBuilder codeOfCountries = new StringBuilder();
    codeOfCountries.append("[");
    for (AbstractCountry country : countryList) {
      codeOfCountries.append(country.getCode()).append(" ");
    }
    return codeOfCountries.toString().trim() + "]";
  }

  public static void print(List<AbstractCountry> countryList) {
    StringBuilder countriesString = new StringBuilder();
    countriesString.append("[");
    for (AbstractCountry country : countryList) {
      countriesString.append(country.toString()).append("\n");
    }
    System.out.print(countriesString.toString().trim() + "]");
  }
}
