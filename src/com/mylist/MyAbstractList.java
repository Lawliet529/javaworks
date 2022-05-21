package com.mylist;

import java.util.StringJoiner;

public abstract class MyAbstractList implements MyList {

  public MyAbstractList() {
  }

  public boolean checkBoundaries(int index, int limit) {
    return (0 <= index) && (index <= limit);
  }

  @Override
  public String toString() {
    StringJoiner s = new StringJoiner("] [", "[", "]");
    for (int i = 0; i < size(); i++) {
      s.add(get(i).toString());
    }
    return s.toString();
  }
}
