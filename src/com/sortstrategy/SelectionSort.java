package com.sortstrategy;

public class SelectionSort implements ISort {

  @Override
  public int sort(int[] data) {
    int n = data.length;
    int count = 0;
    int temp;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (data[j] < data[min]) {
          min = j;
        }
      }
      temp = data[min];
      data[min] = data[i];
      data[i] = temp;
      count++;
    }
    return count;
  }
}
