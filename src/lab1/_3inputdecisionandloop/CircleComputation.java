package lab1._3inputdecisionandloop;

import java.util.Scanner;

/**
 * 3. Exercises on Input, Decision and Loop
 * 3.2. CircleComputation
 */
public class CircleComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        input.nextLine();
        input.close();

        double diameter = radius * 2;
        double circumference = diameter * Math.PI;
        double area = Math.PI * radius * radius;
        System.out.printf("Diameter is : %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);
    }
}
