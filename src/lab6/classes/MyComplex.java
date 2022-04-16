package lab6.classes;

import java.util.StringJoiner;

/**
 * 1. More Exercises on Classes
 *
 * <p>1.1 The MyComplex class
 */
public class MyComplex {

  private double real;
  private double imag;

  public MyComplex() {
    real = 0.0;
    imag = 0.0;
  }

  public MyComplex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double getReal() {
    return real;
  }

  public double getImag() {
    return imag;
  }

  public void setImag(double imag) {
    this.imag = imag;
  }

  public void setValue(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  @Override
  public String toString() {
    return new StringJoiner(" + ", "", "i")
        .add(real + "")
        .add(imag + "")
        .toString();
  }

  public boolean isReal() {
    return imag == 0;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public boolean isImaginary() {
    return real == 0;
  }

  public boolean equals(double real, double imag) {
    return this.real == real
        && this.imag == imag;
  }

  public boolean equals(MyComplex another) {
    return real == another.getReal()
        && imag == another.getImag();
  }

  public double magnitude() {
    return Math.sqrt(real * real + imag * imag);
  }

  public MyComplex add(MyComplex right) {
    real += right.getReal();
    imag += right.getImag();
    return this;
  }

  public MyComplex addNew(MyComplex right) {
    return new MyComplex(
        real + right.getReal(),
        imag + right.getImag()
    );
  }

  public MyComplex subtract(MyComplex right) {
    real -= right.getReal();
    imag -= right.getImag();
    return this;
  }

  public MyComplex subtractNew(MyComplex right) {
    return new MyComplex(
        real - right.getReal(),
        imag - right.getImag()
    );
  }

  public double argument() {
    return Math.atan(imag / real);
  }

  public MyComplex multiply(MyComplex another) {
    real = real * another.getReal() - imag * another.getImag();
    imag = real * another.getImag() + imag * another.getReal();
    return this;
  }

  public MyComplex divide(MyComplex another) {
    real = (real * another.getReal() + imag + another.getImag())
        / (Math.pow(another.getReal(), 2) + Math.pow(another.getImag(), 2));
    imag = (imag * another.getReal() - real * another.getImag())
        / (Math.pow(another.getReal(), 2) + Math.pow(another.getImag(), 2));
    return this;
  }

  public MyComplex conjugate() {
    imag = -imag;
    return this;
  }
}
