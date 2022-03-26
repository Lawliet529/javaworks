package lab4.more;

import java.util.HashMap;

/**
 * 1. More Exercises
 * 1.2. Trigonometric Series
 */
public class TrigonometricSeries {
    public static void main(String[] args) {
        HashMap<String, Double> valuesOfX = new HashMap<>();
        valuesOfX.put("0", (double) 0);
        valuesOfX.put("π/6", Math.PI / 6);
        valuesOfX.put("π/4", Math.PI / 4);
        valuesOfX.put("π/3", Math.PI / 3);
        valuesOfX.put("π/2", Math.PI / 2);

        int numTerms = 10000;

        for (String key : valuesOfX.keySet()) {
            System.out.println("x = " + key);
            System.out.println("sin(" + key + ") = " + sin(valuesOfX.get(key), numTerms));
            System.out.println("Difference: " +
                    (sin(valuesOfX.get(key), numTerms) - Math.sin(valuesOfX.get(key))));
            System.out.println("cos(" + key + ") = " + cos(valuesOfX.get(key), numTerms));
            System.out.println("Difference: " +
                    (cos(valuesOfX.get(key), numTerms) - Math.cos(valuesOfX.get(key))));
            System.out.println();
        }

    }

    // x in radians
    public static double sin(double x, int numTerms) {
        double sum = x;
        double term = x;
        for (int n = 3; n < numTerms; n += 2) {
            term *= -(x * x) / (n * (n - 1));
            sum += term;
        }
        return sum;
    }

    public static double cos(double x, int numTerms) {
        double sum = 1;
        double term = 1;
        for (int n = 2; n < numTerms; n += 2) {
            term *= -(x * x) / (n * (n - 1));
            sum += term;
        }
        return sum;
    }
}
