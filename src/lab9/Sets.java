package lab9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sets {

  public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
    Set<Integer> intersection = new HashSet<>();

    for (Integer value : first) {
      if (second.contains(value)) {
        intersection.add(value);
      }
    }
    return intersection;
  }

  public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
    Set<Integer> union = new HashSet<>();

    union.addAll(first);
    union.addAll(second);
    return union;
  }

  public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
    Set<Integer> intersection = new HashSet<>(first);

    intersection.retainAll(second);
    return intersection;
  }

  public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
    Set<Integer> union = new HashSet<>(first);

    union.addAll(second);
    return union;
  }

  public static List<Integer> toList(Set<Integer> source) {
    return new ArrayList<>(source);
  }

  public static List<Integer> removeDuplicates(List<Integer> source) {
    Set<Integer> set = new HashSet<>(source);
    return new ArrayList<>(set);
  }

  public static List<Integer> removeDuplicatesManual(List<Integer> source) {
    return source.stream().distinct().collect(Collectors.toList());
  }

  public static String firstRecurringCharacter(String s) {
    char[] arr = s.toCharArray();
    Set<Character> set = new HashSet<>();
    for (Character c : arr) {
      if (!set.contains(c)) {
        set.add(c);
      } else {
        return c.toString();
      }
    }
    return "";
  }

  public static Set<Character> allRecurringChars(String s) {
    char[] arr = s.toCharArray();
    Set<Character> set = new HashSet<>();
    Set<Character> recurring = new HashSet<>();

    for (Character c : arr) {
      if (!set.contains(c)) {
        set.add(c);
      } else {
        recurring.add(c);
      }
    }
    return recurring;
  }

  public static Integer[] toArray(Set<Integer> source) {
    Integer[] arr = new Integer[source.size()];
    arr = source.toArray(arr);
    return arr;
  }

  public static int getFirst(TreeSet<Integer> source) {
    return source.first();
  }

  public static int getLast(TreeSet<Integer> source) {
    return source.last();
  }

  public static int getGreater(TreeSet<Integer> source, int value) {
    Iterator<Integer> integerIterator = source.iterator();
    if (integerIterator.hasNext()) {
      int i = integerIterator.next();
      if (i > value) {
        return i;
      }
    }
    throw new NoSuchElementException("No element is greater than the given value.");
  }
}
