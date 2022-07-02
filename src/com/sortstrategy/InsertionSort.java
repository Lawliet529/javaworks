package com.sortstrategy;

public class InsertionSort implements ISort {

  @Override
  public int sort(int[] data) {
    int n = data.length;
    int count = 0;
    int temp;
    for (int i = 1; i < n; i++) {
      temp = data[i];
      int j = i - 1;
      while (j >= 0 && data[j] > temp) {
        data[j + 1] = data[j];
        j--;
        count++;
      }
      data[j + 1] = temp;
    }
    return count;
  }
}
