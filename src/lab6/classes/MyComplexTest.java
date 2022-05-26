package lab6.classes;

public class MyComplexTest {

  public static void main(String[] args) {
    MyComplex complex1 = new MyComplex();
    System.out.println("complex1 = " + complex1);

    complex1.setReal(5);
    System.out.println("real = " + complex1.getReal());
    complex1.setImag(6);
    System.out.println("imag = " + complex1.getImag());
    complex1.setValue(7, 8);
    System.out.println(complex1);

    MyComplex complex2 = new MyComplex(3, 4);
    System.out.println("complex2 = " + complex2);

    MyComplex complex3 = new MyComplex(3, 0);
    System.out.println("complex3 = " + complex3);
    System.out.println("complex3.isReal() = " + complex3.isReal());
    System.out.println("complex3.isImaginary() = " + complex3.isImaginary());

    MyComplex complex4 = new MyComplex(0, 4);
    System.out.println("complex4 = " + complex4);
    System.out.println("complex4.isReal() = " + complex4.isReal());
    System.out.println("complex4.isImaginary() = " + complex4.isImaginary());

    System.out.println("c3 + c4 = " + complex3.addNew(complex4));
    System.out.println("-> c3 = " + complex3);
    System.out.println("c3 = c3 + c4 = " + complex3.add(complex4));
    System.out.println("-> c3 = " + complex3);

    System.out.println("(c1 == c2) = " + complex1.equals(complex2));
    System.out.println("(c2 == c3) = " + complex2.equals(complex3));
  }
}
