package com.mylist;

public class MyListTest {

  public static void main(String[] args) {
    MyList list1 = new MyLinkedList();
    for (int i = 0; i < 10; i++) {
      list1.add(i + 1);
    }
    System.out.println(list1);

    System.out.println("Add value 11:");
    list1.add(11);
    System.out.println(list1);

    System.out.println("Add value 12 at index 5:");
    list1.add(12, 5);
    System.out.println(list1);

    System.out.println("Remove elements at index 6:");
    list1.remove(6);
    System.out.println(list1);

    System.out.println("Element at index 8:");
    System.out.println(list1.get(8));

    System.out.println();

    MyList list2 = new MyLinkedList();
    for (int i = 0; i < 10; i++) {
      list2.add(i + 1);
    }
    System.out.println(list2);

    System.out.println("Add value 11:");
    list2.add(11);
    System.out.println(list2);

    System.out.println("Add value 12 at index 5:");
    list2.add(12, 5);
    System.out.println(list2);

    System.out.println("Remove elements at index 6:");
    list2.remove(6);
    System.out.println(list2);

    System.out.println("Element at index 8:");
    System.out.println(list2.get(8));
  }
}
