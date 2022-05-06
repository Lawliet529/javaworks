package lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {

  public static void insertFirst(ArrayList<Integer> list, int value) {
    list.add(0, value);
  }

  public static void insertLast(ArrayList<Integer> list, int value) {
    list.add(value);
  }

  public static void replace(ArrayList<Integer> list, int value) {
    list.set(2, value);
  }

  public static void removeThird(ArrayList<Integer> list) {
    list.remove(2);
  }

  public static void removeEvil(ArrayList<Integer> list) {
    list.removeIf(s -> (s == 666));
  }

  public static ArrayList<Integer> generateSquare() {
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      list.add(i * i);
    }
    return list;
  }

  public static boolean contains(ArrayList<Integer> list, int value) {
    return list.contains(value);
  }

  public static ArrayList<Integer> copy(ArrayList<Integer> source) {
    return new ArrayList<>(source);
  }

  public static void reverse(ArrayList<Integer> list) {
    Collections.reverse(list);
  }

  public static void reverseManual(ArrayList<Integer> list) {
    ArrayList<Integer> reversed = new ArrayList<>();

    for (int i = list.size() - 1; i >= 0; i--) {
      reversed.add(list.get(i));
    }
    list = new ArrayList<>(reversed);
  }

  public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
    list.addFirst(value);
    list.addLast(value);
  }
}
