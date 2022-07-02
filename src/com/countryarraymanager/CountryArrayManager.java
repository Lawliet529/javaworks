package com.countryarraymanager;

public class CountryArrayManager {

  private CountryData[] countryDataArray;
  private int length;
  private int increment;

  public CountryArrayManager() {
    this.increment = 10;
    countryDataArray = new CountryData[this.increment];
    this.length = 0;
  }

  public CountryArrayManager(int maxLength) {
    this.increment = 10;
    countryDataArray = new CountryData[maxLength];
    this.length = 0;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getLength() {
    return this.length;
  }

  public CountryData[] getCountryDataArray() {
    return this.countryDataArray;
  }

  private void allocateMore() {
    CountryData[] newArray = new CountryData[this.length + this.increment];
    System.arraycopy(this.countryDataArray, 0, newArray, 0, this.countryDataArray.length);
    this.countryDataArray = newArray;
  }

  public void append(CountryData countryData) {
    if (this.length >= this.countryDataArray.length) {
      allocateMore();
    }

    this.countryDataArray[this.length] = countryData;
    this.length++;
  }

  public void add(CountryData countryData, int index) {
    if (this.length >= this.countryDataArray.length) {
      allocateMore();
    }

    for (int i = this.length; i > index; i--) {
      this.countryDataArray[i] = this.countryDataArray[i - 1];
    }
    this.countryDataArray[index] = countryData;
    this.length++;
  }

  public void remove(int index) {
    for (int i = index; i < this.length - 1; i++) {
      this.countryDataArray[i] = this.countryDataArray[i + 1];
    }
    this.countryDataArray[this.length - 1] = null;
    this.length--;
  }

  public CountryData countryDataAt(int index) {
    return this.countryDataArray[index];
  }

  public CountryData[] sortIncreasingByPopulation() {
    CountryData[] sortedArray = new CountryData[this.length];
    for (int i = 0; i < this.length; i++) {
      sortedArray[i] = this.countryDataArray[i];
    }
    for (int i = 0; i < sortedArray.length - 1; i++) {
      for (int j = i + 1; j < sortedArray.length; j++) {
        if (sortedArray[i].getPopulation() > sortedArray[j].getPopulation()) {
          CountryData temp = sortedArray[i];
          sortedArray[i] = sortedArray[j];
          sortedArray[j] = temp;
        }
      }
    }
    return sortedArray;
  }

  public CountryData[] sortDecreasingByPopulation() {
    CountryData[] sortedArray = new CountryData[this.length];
    for (int i = 0; i < this.length; i++) {
      sortedArray[i] = this.countryDataArray[i];
    }
    for (int i = 0; i < sortedArray.length - 1; i++) {
      for (int j = i + 1; j < sortedArray.length; j++) {
        if (sortedArray[i].getPopulation() < sortedArray[j].getPopulation()) {
          CountryData temp = sortedArray[i];
          sortedArray[i] = sortedArray[j];
          sortedArray[j] = temp;
        }
      }
    }
    return sortedArray;
  }

  public CountryData[] sortIncreasingByArea() {
    CountryData[] sortedArray = new CountryData[this.length];
    for (int i = 0; i < this.length; i++) {
      sortedArray[i] = this.countryDataArray[i];
    }
    for (int i = 0; i < sortedArray.length - 1; i++) {
      for (int j = i + 1; j < sortedArray.length; j++) {
        if (sortedArray[i].getArea() > sortedArray[j].getArea()) {
          CountryData temp = sortedArray[i];
          sortedArray[i] = sortedArray[j];
          sortedArray[j] = temp;
        }
      }
    }
    return sortedArray;
  }

  public CountryData[] sortDecreasingByArea() {
    CountryData[] sortedArray = new CountryData[this.length];
    for (int i = 0; i < this.length; i++) {
      sortedArray[i] = this.countryDataArray[i];
    }
    for (int i = 0; i < sortedArray.length - 1; i++) {
      for (int j = i + 1; j < sortedArray.length; j++) {
        if (sortedArray[i].getArea() < sortedArray[j].getArea()) {
          CountryData temp = sortedArray[i];
          sortedArray[i] = sortedArray[j];
          sortedArray[j] = temp;
        }
      }
    }
    return sortedArray;
  }

  public CountryData[] sortIncreasingByGdp() {
    CountryData[] sortedArray = new CountryData[this.length];
    for (int i = 0; i < this.length; i++) {
      sortedArray[i] = this.countryDataArray[i];
    }
    for (int i = 0; i < sortedArray.length - 1; i++) {
      for (int j = i + 1; j < sortedArray.length; j++) {
        if (sortedArray[i].getGdp() > sortedArray[j].getGdp()) {
          CountryData temp = sortedArray[i];
          sortedArray[i] = sortedArray[j];
          sortedArray[j] = temp;
        }
      }
    }
    return sortedArray;
  }

  public CountryData[] sortDecreasingByGdp() {
    CountryData[] sortedArray = new CountryData[this.length];
    for (int i = 0; i < this.length; i++) {
      sortedArray[i] = this.countryDataArray[i];
    }
    for (int i = 0; i < sortedArray.length - 1; i++) {
      for (int j = i + 1; j < sortedArray.length; j++) {
        if (sortedArray[i].getGdp() < sortedArray[j].getGdp()) {
          CountryData temp = sortedArray[i];
          sortedArray[i] = sortedArray[j];
          sortedArray[j] = temp;
        }
      }
    }
    return sortedArray;
  }

  public CountryData[] filterContinent(String continent) {
    CountryData[] filteredArray = new CountryData[this.length];
    int count = 0;
    for (int i = 0; i < this.length; i++) {
      if (this.countryDataArray[i].getContinent().equals(continent)) {
        filteredArray[count] = this.countryDataArray[i];
        count++;
      }
    }
    CountryData[] result = new CountryData[count];
    for (int i = 0; i < count; i++) {
      result[i] = filteredArray[i];
    }
    return result;
  }

  public CountryData[] filterMostPopulousCountries(int howMany) {
    CountryData[] sortedArray = sortDecreasingByPopulation();
    CountryData[] result = new CountryData[howMany];
    for (int i = 0; i < howMany; i++) {
      result[i] = sortedArray[i];
    }
    return result;
  }

  public CountryData[] filterLeastPopulousCountries(int howMany) {
    CountryData[] sortedArray = sortIncreasingByPopulation();
    CountryData[] result = new CountryData[howMany];
    for (int i = 0; i < howMany; i++) {
      result[i] = sortedArray[i];
    }
    return result;
  }

  public CountryData[] filterLargestAreaCountries(int howMany) {
    CountryData[] sortedArray = sortDecreasingByArea();
    CountryData[] result = new CountryData[howMany];
    for (int i = 0; i < howMany; i++) {
      result[i] = sortedArray[i];
    }
    return result;
  }

  public CountryData[] filterSmallestAreaCountries(int howMany) {
    CountryData[] sortedArray = sortIncreasingByArea();
    CountryData[] result = new CountryData[howMany];
    for (int i = 0; i < howMany; i++) {
      result[i] = sortedArray[i];
    }
    return result;
  }

  public CountryData[] filterHighestGdpCountries(int howMany) {
    CountryData[] sortedArray = sortDecreasingByGdp();
    CountryData[] result = new CountryData[howMany];
    for (int i = 0; i < howMany; i++) {
      result[i] = sortedArray[i];
    }
    return result;
  }

  public CountryData[] filterLowestGdpCountries(int howMany) {
    CountryData[] sortedArray = sortIncreasingByGdp();
    CountryData[] result = new CountryData[howMany];
    for (int i = 0; i < howMany; i++) {
      result[i] = sortedArray[i];
    }
    return result;
  }

  public static String codeOfCountriesToString(CountryData[] countryDataArray, int length) {
    StringBuilder codeOfCountries = new StringBuilder();
    codeOfCountries.append("[");
    for (int i = 0; i < length; i++) {
      CountryData countryData = countryDataArray[i];
      codeOfCountries.append(countryData.getCode()).append(" ");
    }
    return codeOfCountries.toString().trim() + "]";
  }

  public static void print(CountryData[] countryDataArray, int length) {
    StringBuilder countriesString = new StringBuilder();
    countriesString.append("[");
    for (int i = 0; i < length; i++) {
      CountryData country = countryDataArray[i];
      countriesString.append(country.toString()).append("\n");
    }
    System.out.print(countriesString.toString().trim() + "]");
  }
}
