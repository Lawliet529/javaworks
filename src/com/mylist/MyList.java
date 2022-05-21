package com.mylist;

public interface MyList {

  void add(Object o);

  void add(Object o, int i);

  void remove(int i);

  Object get(int i);

  int size();
}
