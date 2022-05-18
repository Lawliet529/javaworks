package lab10.collections.list;

public interface MyList<E> {

  int size();

  void add(E o);

  void add(E o, int i);

  void remove(int i);

  E get(int i);
}
