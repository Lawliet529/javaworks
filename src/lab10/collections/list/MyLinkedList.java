package lab10.collections.list;

public class MyLinkedList<E> extends MyAbstractList<E> {

  private int size;
  private MyLinkedListNode<E> head;

  public MyLinkedList() {}

  @Override
  public int size() {
    return size;
  }

  @Override
  public void add(E o) {
    if (size == 0) {
      head.item = o;
    } else {
      MyLinkedListNode<E> last = getNodeByIndex(size - 1);
      last.next = new MyLinkedListNode<>(o, null);
    }
    size++;
  }

  @Override
  public void add(E o, int i) {
    if (i < 0 || size < i) {
      throw new IndexOutOfBoundsException();
    }

    if (i == 0) {
      head = new MyLinkedListNode<>(o, head);
    } else {
      MyLinkedListNode<E> previous = getNodeByIndex(i - 1);
      previous.next = new MyLinkedListNode<>(o, previous.next);
    }
    size++;
  }

  @Override
  public void remove(int i) {
    if (i < 0 || size <= i) {
      throw new IndexOutOfBoundsException();
    }

    if (i == 0) {
      head = head.next;
    } else {
      getNodeByIndex(i - 1).next = getNodeByIndex(i - 1).next;
    }
    size--;
  }

  @Override
  public E get(int i) {
    return getNodeByIndex(i).item;
  }

  private MyLinkedListNode<E> getNodeByIndex(int index) {
    if (index < 0 || size <= index) {
      throw new IndexOutOfBoundsException();
    }

    MyLinkedListNode<E> node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  private static class MyLinkedListNode<E> {

    E item;
    MyLinkedListNode<E> next;

    public MyLinkedListNode(E item, MyLinkedListNode<E> next) {
      this.item = item;
      this.next = next;
    }
  }
}
