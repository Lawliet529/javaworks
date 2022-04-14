package lab5.composition;

class MyRectangleTest {

  public static void main(String[] args) {
    MyRectangle rectangle1 = new MyRectangle(1, 2, 3, 4);

    System.out.println(rectangle1);
    System.out.println("vertex1 = " + rectangle1.getVertex1());
    System.out.println("vertex2 = " + rectangle1.getVertex2());

    rectangle1.setVertex1(5, 6);
    System.out.println("vertex1 = " + rectangle1.getVertex1());
    rectangle1.setVertex1(new MyPoint(1, 2));
    System.out.println("vertex1 = " + rectangle1.getVertex1());

    rectangle1.setVertex2(7, 8);
    System.out.println("vertex2 = " + rectangle1.getVertex2());
    rectangle1.setVertex2(new MyPoint(3, 4));
    System.out.println("vertex2 = " + rectangle1.getVertex2());

    System.out.println("perimeter = " + rectangle1.perimeter());
    System.out.println("area = " + rectangle1.area());
    System.out.println(rectangle1.isSquare());

    MyRectangle rectangle2 = new MyRectangle(
        new MyPoint(0, 3), new MyPoint(4, 0)
    );
    System.out.println(rectangle2);
    System.out.println("perimeter = " + rectangle2.perimeter());
    System.out.println("area = " + rectangle2.area());
    System.out.println(rectangle2.isSquare());
  }
}
