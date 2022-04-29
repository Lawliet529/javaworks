package lab8.polymorphism.shape;

public class ShapeTest {

  public static void main(String[] args) {
    Circle shape1 = new Circle(5.5, "red", false);
    System.out.println(shape1);
    System.out.println(shape1.getArea());
    System.out.println(shape1.getPerimeter());
    System.out.println(shape1.getColor());
    System.out.println(shape1.isFilled());
    System.out.println(shape1.getRadius());

    Rectangle shape3 = new Rectangle(1.0, 2.0, "red", false);
    System.out.println(shape3);
    System.out.println(shape3.getArea());
    System.out.println(shape3.getPerimeter());
    System.out.println(shape3.getColor());
    System.out.println(shape3.getLength());

    Square shape4 = new Square(6.6);
    System.out.println(shape4);
    System.out.println(shape4.getArea());
    System.out.println(shape4.getColor());
    System.out.println(shape4.getSide());
    System.out.println(shape4.getLength());
  }
}
