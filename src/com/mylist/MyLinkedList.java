package com.mylist;

/**
 * Implementation of a simplified LinkedList class
 */
public class MyLinkedList extends MyAbstractList {

  MyLinkedListNode head;
  int size;

  public MyLinkedList() {
    head = null;
    size = 0;
  }

  private MyLinkedListNode getNodeByIndex(int index) {
    if (!checkBoundaries(index, size() - 1)) {
      throw new IndexOutOfBoundsException();
    }

    MyLinkedListNode current = head;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }
    return current;
  }

  @Override
  public void add(Object o) {
    if (size() == 0) {
      head = new MyLinkedListNode(o);
    } else {
      MyLinkedListNode last = getNodeByIndex(size() - 1);
      last.setNext(new MyLinkedListNode(o));
    }
    size++;
  }

  @Override
  public void add(Object o, int index) {
    if (!checkBoundaries(index, size())) {
      throw new IndexOutOfBoundsException();
    }

    if (index == 0) {
      head = new MyLinkedListNode(o, head);
    } else {
      MyLinkedListNode previous = getNodeByIndex(index - 1);
      previous.setNext(new MyLinkedListNode(o, previous.getNext()));
    }
    size++;
  }

  @Override
  public Object get(int index) {
    return getNodeByIndex(index).getPayload();
  }

  @Override
  public void remove(int index) {
    if (!checkBoundaries(index, size() - 1)) {
      throw new IndexOutOfBoundsException();
    }

    if (index == 0) {
      head = head.getNext();
    } else {
      MyLinkedListNode previous = getNodeByIndex(index - 1);
      previous.setNext(getNodeByIndex(index).getNext());
    }
    size--;
  }

  @Override
  public int size() {
    return size;
  }
}
