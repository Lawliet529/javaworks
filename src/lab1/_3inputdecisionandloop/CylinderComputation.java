package lab1._3inputdecisionandloop;

import java.util.Scanner;

/**
 * 3. Exercises on Input, Decision and Loop
 *
 * <p>3.2.2. CylinderComputation
 */
public class CylinderComputation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the base radius: ");
    double radius = input.nextDouble();
    System.out.print("Enter the height: ");
    double height = input.nextDouble();
    input.nextLine();
    input.close();

    double baseArea = Math.PI * radius * radius;
    double surfaceArea = 2 * baseArea + 2 * Math.PI * radius * height;
    double volume = baseArea * height;
    System.out.printf("Base area is: %.2f%n", baseArea);
    System.out.printf("Surface area is: %.2f%n", surfaceArea);
    System.out.printf("Volume is: %.2f%n", volume);
  }
}
