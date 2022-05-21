package com.mylist;

/**
 * Implementation of a simplified ArrayList
 */
public class MyArrayList extends MyAbstractList {

  static final int INITIAL_SIZE = 16;
  Object[] elements;
  int size;

  public MyArrayList() {
    elements = new Object[INITIAL_SIZE];
    size = 0;
  }

  @Override
  public void add(Object o) {
    if (size >= elements.length - 1) {
      enlarge();
    }
    elements[size] = o;
    size++;
  }

  @Override
  public void add(Object o, int index) {
    if (!checkBoundaries(index, size())) {
      throw new IndexOutOfBoundsException();
    }

    if (size >= elements.length - 1) {
      enlarge();
    }
    System.arraycopy(elements, index, elements, index + 1, size - index);
    elements[index] = o;
    size++;
  }

  @Override
  public Object get(int index) {
    return elements[index];
  }

  @Override
  public void remove(int index) {
    if (!checkBoundaries(index, size() - 1)) {
      throw new IndexOutOfBoundsException();
    }

    System.arraycopy(elements, index + 1, elements, index, size() - 1 - index);
    size--;
  }

  @Override
  public int size() {
    return size;
  }

  void enlarge() {
    Object[] tmp = new Object[elements.length * 2];
    System.arraycopy(elements, 0, tmp, 0, elements.length);
    elements = tmp;
  }
}
