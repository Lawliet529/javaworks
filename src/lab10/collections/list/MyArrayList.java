package lab10.collections.list;

public class MyArrayList<E> extends MyAbstractList<Object> {

  private static final int DEFAULT_CAPACITY = 1000;
  private int size;
  private Object[] elements;

  public MyArrayList() {
  }

  @Override
  public int size() {
    return elements.length;
  }

  @Override
  public void add(Object o) {
    if (size() == DEFAULT_CAPACITY) {
      throw new ArithmeticException("Capacity exceeded.");
    }

    Object[] newArr = new Object[size() + 1];
    System.arraycopy(elements, 0, newArr, 0, size());
    newArr[size()] = o;
    elements = newArr;
    size++;
  }

  @Override
  public void add(Object o, int i) {
    if (size() == DEFAULT_CAPACITY) {
      throw new ArithmeticException("Capacity exceeded.");
    }

    Object[] newArr = new Object[size() + 1];
    System.arraycopy(elements, 0, newArr, 0, i);
    System.arraycopy(elements, i, newArr, i + 1, size() - i);
    newArr[i] = o;
    elements = newArr;
    size++;
  }

  @Override
  public void remove(int i) {
    Object[] newArr = new Object[size() - 1];
    System.arraycopy(elements, 0, newArr, 0, i);
    System.arraycopy(elements, i + 1, newArr, i, size() - 1 - i);
    elements = newArr;
    size--;
  }

  @Override
  public Object get(int i) {
    return elements[i];
  }
}
