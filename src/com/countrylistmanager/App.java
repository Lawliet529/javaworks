package com.countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

  private static final String COMMA_DELIMITER = ",";

  public static void main(String[] args) {
    init();

    System.out.println("Original data:");
    testOriginalData();

    System.out.println("Sorted by population:");
    System.out.print("  Increasing: ");
    testSortIncreasingByPopulation();
    System.out.print("  Decreasing: ");
    testSortDecreasingByPopulation();
    System.out.println("Sorted by area:");
    System.out.print("  Increasing: ");
    testSortIncreasingByArea();
    System.out.print("  Decreasing: ");
    testSortDecreasingByArea();
    System.out.println("Sorted by gdp:");
    System.out.print("  Increasing: ");
    testSortIncreasingByGdp();
    System.out.print("  Decreasing: ");
    testSortDecreasingByGdp();

    System.out.println("Filtered by continent (Europe):");
    testFilterContinent();
    System.out.println("Filtered by population:");
    System.out.print("  Most: ");
    testFilterMostPopulousCountries();
    System.out.print("  Least: ");
    testFilterLeastPopulousCountries();
    System.out.println("Filtered by area:");
    System.out.print("  Largest: ");
    testFilterLargestAreaCountries();
    System.out.print("  Smallest: ");
    testFilterSmallestAreaCountries();
    System.out.println("Filtered by gdp:");
    System.out.print("  Highest: ");
    testFilterHighestGdpCountries();
    System.out.print("  Lowest: ");
    testFilterLowestGdpCountries();
  }

  public static void readListData(String filePath) {
    BufferedReader dataReader = null;
    try {
      String line;
      dataReader = new BufferedReader(new FileReader(filePath));

      // Read file line by line
      while ((line = dataReader.readLine()) != null) {
        List<String> dataList = parseDataLineToList(line);
        if (dataList.size() != 6) {
          continue;
        }

        if (dataList.get(0).equals("code")) {
          continue;
        }

        CountryData newCountryData =
            new CountryData.CountryDataBuilder(dataList.get(0))
                .setName(dataList.get(1))
                .setPopulation(Integer.parseInt(dataList.get(2)))
                .setArea(Double.parseDouble(dataList.get(3)))
                .setGdp(Double.parseDouble(dataList.get(4)))
                .build();

        // Create new CountryData object and add to list
        AbstractCountry newCountry =
            CountryFactory.getInstance().createCountry(dataList.get(5), newCountryData);
        CountryListManager.getInstance().append(newCountry);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (dataReader != null) dataReader.close();
      } catch (IOException crunchifyException) {
        crunchifyException.printStackTrace();
      }
    }
  }

  public static List<String> parseDataLineToList(String dataLine) {
    List<String> result = new ArrayList<String>();
    if (dataLine != null) {
      String[] splitData = dataLine.split(COMMA_DELIMITER);
      for (int i = 0; i < splitData.length; i++) {
        result.add(splitData[i]);
      }
    }
    return result;
  }

  public static String[] parseDataLineToArray(String dataLine) {
    if (dataLine == null) {
      return null;
    }

    return dataLine.split(COMMA_DELIMITER);
  }

  public static void init() {
    String filePath = "data/countries2.csv";
    readListData(filePath);
  }

  public static void testOriginalData() {
    String codes =
        CountryListManager.codeOfCountriesToString(
            CountryListManager.getInstance().getCountryList());
    System.out.println(codes);
  }

  public static void testSortIncreasingByPopulation() {
    List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByPopulation();
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testSortDecreasingByPopulation() {
    List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByPopulation();
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testSortIncreasingByArea() {
    List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByArea();
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testSortDecreasingByArea() {
    List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByArea();
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testSortIncreasingByGdp() {
    List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByGdp();
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testSortDecreasingByGdp() {
    List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByGdp();
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testFilterContinent() {
    List<AbstractCountry> countries = CountryListManager.getInstance().filterContinent("Europe");
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testFilterMostPopulousCountries() {
    List<AbstractCountry> countries =
        CountryListManager.getInstance().filterMostPopulousCountries(5);
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testFilterLeastPopulousCountries() {
    List<AbstractCountry> countries =
        CountryListManager.getInstance().filterLeastPopulousCountries(5);
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testFilterLargestAreaCountries() {
    List<AbstractCountry> countries =
        CountryListManager.getInstance().filterLargestAreaCountries(5);
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testFilterSmallestAreaCountries() {
    List<AbstractCountry> countries =
        CountryListManager.getInstance().filterSmallestAreaCountries(5);
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testFilterHighestGdpCountries() {
    List<AbstractCountry> countries = CountryListManager.getInstance().filterHighestGdpCountries(5);
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }

  public static void testFilterLowestGdpCountries() {
    List<AbstractCountry> countries = CountryListManager.getInstance().filterLowestGdpCountries(5);
    String codeString = CountryListManager.codeOfCountriesToString(countries);
    System.out.println(codeString);
  }
}
