package lab5.composition;

import java.util.Arrays;

class BookTest {

  public static void main(String[] args) {
    Author[] authors = new Author[2];
    authors[0] = new Author("Tan Ah Teck", "ahteck@somewhre.com", 'm');
    authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
    System.out.println(Arrays.toString(authors));

    Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
    System.out.println(javaDummy);

    javaDummy.setPrice(29.95);
    javaDummy.setQty(28);
    System.out.println("name is: " + javaDummy.getName());
    System.out.println("price is: " + javaDummy.getPrice());
    System.out.println("qty is: " + javaDummy.getQty());
    System.out.println("Author is: " + Arrays.toString(javaDummy.getAuthors()));

    Author[] anotherAuthors = {new Author("Paul Tan", "paul@somewhere.com", 'm')};
    Book anotherBook = new Book("more Java", anotherAuthors,
        29.95);
    System.out.println(anotherBook);
  }
}
