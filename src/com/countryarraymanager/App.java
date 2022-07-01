package com.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

  private static final String COMMA_DELIMITER = ",";
  private static CountryArrayManager countryArrayManager = new CountryArrayManager();

  public static void main(String[] args) {
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

    System.out.println("Filtered by continent (Asia):");
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

  public static void readArrayData(String filePath) {
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

        // Parse data and create CountryData objects
        CountryData newCountryData =
            new CountryData(dataList.get(0))
                .setName(dataList.get(1))
                .setPopulation(Integer.parseInt(dataList.get(2)))
                .setArea(Double.parseDouble(dataList.get(3)))
                .setGdp(Double.parseDouble(dataList.get(4)))
                .setContinent(dataList.get(5));
        countryArrayManager.append(newCountryData);
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
    List<String> result = new ArrayList<>();
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
    String filePath = "data/countries1.csv";
    readArrayData(filePath);
  }

  public static void testOriginalData() {
    init();
    String codes =
        CountryArrayManager.codeOfCountriesToString(
            countryArrayManager.getCountryDataArray(), countryArrayManager.getLength());
    System.out.println(codes);
  }

  public static void testSortIncreasingByPopulation() {
    CountryData[] countries = countryArrayManager.sortIncreasingByPopulation();
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testSortDecreasingByPopulation() {
    CountryData[] countries = countryArrayManager.sortDecreasingByPopulation();
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testSortIncreasingByArea() {
    CountryData[] countries = countryArrayManager.sortIncreasingByArea();
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testSortDecreasingByArea() {
    CountryData[] countries = countryArrayManager.sortDecreasingByArea();
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testSortIncreasingByGdp() {
    CountryData[] countries = countryArrayManager.sortIncreasingByGdp();
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testSortDecreasingByGdp() {
    CountryData[] countries = countryArrayManager.sortDecreasingByGdp();
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testFilterContinent() {
    CountryData[] countries = countryArrayManager.filterContinent("Asia");
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testFilterMostPopulousCountries() {
    CountryData[] countries = countryArrayManager.filterMostPopulousCountries(10);
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testFilterLeastPopulousCountries() {
    CountryData[] countries = countryArrayManager.filterLeastPopulousCountries(10);
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testFilterLargestAreaCountries() {
    CountryData[] countries = countryArrayManager.filterLargestAreaCountries(10);
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testFilterSmallestAreaCountries() {
    CountryData[] countries = countryArrayManager.filterSmallestAreaCountries(10);
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testFilterHighestGdpCountries() {
    CountryData[] countries = countryArrayManager.filterHighestGdpCountries(10);
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }

  public static void testFilterLowestGdpCountries() {
    CountryData[] countries = countryArrayManager.filterLowestGdpCountries(10);
    String codes = CountryArrayManager.codeOfCountriesToString(countries, countries.length);
    System.out.println(codes);
  }
}
