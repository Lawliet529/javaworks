package lab1.inputdecisionandloop;

import java.util.Scanner;

/**
 * 3. Exercises on Input, Decision and Loop
 *
 * <p>3.4. PensionContributionCalculatorWithSentinel
 */
public class PensionContributionCalculatorWithSentinel {

  public static void main(String[] args) {
    final int SALARY_CEILING = 6000;
    final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    final double EMPLOYER_RATE_55_TO_60 = 0.13;
    final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    final double EMPLOYER_RATE_60_TO_65 = 0.09;
    final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    final double EMPLOYER_RATE_65_ABOVE = 0.075;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the monthly salary (or -1 to end): $");
    int salary = input.nextInt();
    while (salary != -1) {
      System.out.print("Enter the age: ");
      int age = input.nextInt();
      input.nextLine();

      int contributableSalary = Math.min(salary, SALARY_CEILING);

      double employeeContribution;
      double employerContribution;
      if (age <= 55) {
        employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
        employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
      } else if (age <= 60) {
        employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
        employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
      } else if (age <= 65) {
        employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
        employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
      } else {
        employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
        employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
      }
      double totalContribution = employeeContribution + employerContribution;

      System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
      System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
      System.out.printf("THe total contribution is: $%.2f%n", totalContribution);
      System.out.println();
      System.out.print("Enter the monthly salary (or -1 to end): $");
      salary = input.nextInt();
    }
    input.close();

    System.out.println("Bye!");
  }
}
