package lab1.inputdecisionandloop;

import java.util.Scanner;

/**
 * 3. Exercises on Input, Decision and Loop
 *
 * <p>3.2.1. SphereComputation
 */
public class SphereComputation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double radius = input.nextDouble();
    input.nextLine();
    input.close();

    double surfaceArea = 4 * Math.PI * radius * radius;
    double volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;
    System.out.printf("Surface area is: %.2f%n", surfaceArea);
    System.out.printf("Volume is: %.2f%n", volume);
  }
}
