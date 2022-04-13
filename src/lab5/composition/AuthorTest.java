package lab5.composition;

class AuthorTest {

  public static void main(String[] args) {
    Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
    System.out.println(author1);

    author1.setEmail("ahteck@somewhere.com");
    System.out.println(author1);
    System.out.println("name is: " + author1.getName());
    System.out.println("email is: " + author1.getEmail());
  }
}
