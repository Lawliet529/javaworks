package com.sortstrategy;

import java.util.Arrays;
import java.util.Random;

public class App {

  public static void main(String[] args) {
    int[] unsortedArray = new int[10];
    Random random = new Random();
    for (int i = 0; i < unsortedArray.length; i++) {
      unsortedArray[i] = random.nextInt(100);
    }

    System.out.println("Using Bubble Sort Algorithm:");
    System.out.println("Before sorting: " + Arrays.toString(unsortedArray));
    int[] sortedArray = unsortedArray.clone();
    SortStrategy.getInstance().setSortee(new BubbleSort());
    int count = SortStrategy.getInstance().sort(sortedArray);
    System.out.println("After sorting: " + Arrays.toString(sortedArray));
    System.out.println("Number of swap: " + count);
    System.out.println();

    System.out.println("Using Insertion Sort Algorithm:");
    System.out.println("Before sorting: " + Arrays.toString(unsortedArray));
    sortedArray = unsortedArray.clone();
    SortStrategy.getInstance().setSortee(new InsertionSort());
    count = SortStrategy.getInstance().sort(sortedArray);
    System.out.println("After sorting: " + Arrays.toString(sortedArray));
    System.out.println("Number of swap: " + count);
    System.out.println();

    System.out.println("Using Selection Sort Algorithm:");
    System.out.println("Before sorting: " + Arrays.toString(unsortedArray));
    sortedArray = unsortedArray.clone();
    SortStrategy.getInstance().setSortee(new SelectionSort());
    count = SortStrategy.getInstance().sort(sortedArray);
    System.out.println("After sorting: " + Arrays.toString(sortedArray));
    System.out.println("Number of swap: " + count);
    System.out.println();
  }
}
