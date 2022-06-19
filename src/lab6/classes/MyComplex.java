package lab6.classes;

import java.util.Objects;

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

  public boolean isReal() {
    return imag == 0;
  }

  public boolean isImaginary() {
    return real == 0;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
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
    if (isReal()) {
      return String.format("%.2f", real);
    } else if (isImaginary()) {
      return String.format("%.2fi", imag);
    } else {
      return String.format("%.2f%+.2fi", real, imag);
    }
  }

  public boolean equals(double real, double imag) {
    return this.real == real && this.imag == imag;
  }

  public boolean equals(MyComplex another) {
    Objects.requireNonNull(another);

    return real == another.real && imag == another.imag;
  }

  public double magnitude() {
    return Math.sqrt(real * real + imag * imag);
  }

  public MyComplex add(MyComplex another) {
    Objects.requireNonNull(another);

    real += another.real;
    imag += another.imag;
    return this;
  }

  public MyComplex addNew(MyComplex another) {
    Objects.requireNonNull(another);
    return new MyComplex(real + another.real, imag + another.imag);
  }

  public MyComplex subtract(MyComplex another) {
    Objects.requireNonNull(another);

    real -= another.real;
    imag -= another.imag;
    return this;
  }

  public MyComplex subtractNew(MyComplex another) {
    Objects.requireNonNull(another);

    return new MyComplex(real - another.real, imag - another.imag);
  }

  public double argument() {
    return Math.atan(imag / real);
  }

  public MyComplex multiply(MyComplex another) {
    Objects.requireNonNull(another);

    real = real * another.real - imag * another.imag;
    imag = real * another.imag + imag * another.real;
    return this;
  }

  public MyComplex divide(MyComplex another) {
    Objects.requireNonNull(another);

    real =
        (real * another.real + imag + another.imag)
            / (Math.pow(another.real, 2) + Math.pow(another.imag, 2));
    imag =
        (imag * another.real - real * another.imag)
            / (Math.pow(another.real, 2) + Math.pow(another.imag, 2));
    return this;
  }

  public MyComplex conjugate() {
    imag = -imag;
    return this;
  }
}
