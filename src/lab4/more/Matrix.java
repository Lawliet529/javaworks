package lab4.more;

import java.util.Random;

/**
 * 1. More Exercises
 *
 * <p>1.1. Matrices (2D Arrays)
 */
public class Matrix {

  public static void main(String[] args) {
    Random rd = new Random();

    int[][] intMatrix1 = new int[4][5];
    for (int row = 0; row < intMatrix1.length; row++) {
      for (int col = 0; col < intMatrix1[0].length; col++) {
        intMatrix1[row][col] = rd.nextInt(10);
      }
    }
    int[][] intMatrix2 = new int[5][3];
    for (int row = 0; row < intMatrix2.length; row++) {
      for (int col = 0; col < intMatrix2[0].length; col++) {
        intMatrix2[row][col] = rd.nextInt(10);
      }
    }

    Matrix.print(intMatrix1);
    System.out.println();
    Matrix.print(intMatrix2);
    System.out.println();

    if (Matrix.haveSameDimension(intMatrix1, intMatrix2)) {
      System.out.println("2 matrices have the same dimension.");
      System.out.println("Sum of 2 matrices:");
      Matrix.print(Matrix.add(intMatrix1, intMatrix2));
      System.out.println("Difference of 2 matrices:");
      Matrix.print(Matrix.subtract(intMatrix1, intMatrix2));
    } else {
      System.out.println("2 matrices don't have the same dimension.");
    }
    if (Matrix.multiply(intMatrix1, intMatrix2) != null) {
      System.out.println("2 matrices can be multiplied and the product is:");
      Matrix.print(Matrix.multiply(intMatrix1, intMatrix2));
    } else {
      System.out.println("2 matrices can not be multiplied.");
    }

    System.out.println();

    double[][] doubleMatrix1 = new double[4][5];
    for (int row = 0; row < doubleMatrix1.length; row++) {
      for (int col = 0; col < doubleMatrix1[0].length; col++) {
        doubleMatrix1[row][col] = rd.nextDouble() * 10;
      }
    }
    double[][] doubleMatrix2 = new double[4][5];
    for (int row = 0; row < doubleMatrix2.length; row++) {
      for (int col = 0; col < doubleMatrix2[0].length; col++) {
        doubleMatrix2[row][col] = rd.nextDouble() * 10;
      }
    }

    Matrix.print(doubleMatrix1);
    System.out.println();
    Matrix.print(doubleMatrix2);
    System.out.println();

    if (Matrix.haveSameDimension(doubleMatrix1, doubleMatrix2)) {
      System.out.println("2 matrices have the same dimension.");
      System.out.println("Sum of 2 matrices:");
      Matrix.print(Matrix.add(doubleMatrix1, doubleMatrix2));
      System.out.println("Difference of 2 matrices:");
      Matrix.print(Matrix.subtract(doubleMatrix1, doubleMatrix2));
    } else {
      System.out.println("2 matrices don't have the same dimension.");
    }
    if (Matrix.multiply(doubleMatrix1, doubleMatrix2) != null) {
      System.out.println("2 matrices can be multiplied and the product is:");
      Matrix.print(Matrix.multiply(doubleMatrix1, doubleMatrix2));
    } else {
      System.out.println("2 matrices can not be multiplied.");
    }
  }

  /**
   * Prints matrices.
   */
  public static void print(int[][] matrix) {
    if (matrix == null) {
      throw new NullPointerException();
    }

    for (int[] row : matrix) {
      for (int col : row) {
        System.out.printf("%3d ", col);
      }
      System.out.println();
    }
  }

  public static void print(double[][] matrix) {
    if (matrix == null) {
      throw new NullPointerException();
    }

    for (double[] row : matrix) {
      for (double col : row) {
        System.out.printf("%6.2f ", col);
      }
      System.out.println();
    }
  }

  /**
   * Checks if 2 matrices have the same dimension.
   */
  public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
    return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
  }

  public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
    return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
  }

  /**
   * Adds 2 matrices.
   */
  public static int[][] add(int[][] matrix1, int[][] matrix2) {
    if (!Matrix.haveSameDimension(matrix1, matrix2)) {
      return null;
    }

    int numRows = matrix1.length;
    int numCols = matrix1[0].length;
    int[][] sumMatrix = new int[numRows][numCols];

    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        sumMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
      }
    }
    return sumMatrix;
  }

  public static double[][] add(double[][] matrix1, double[][] matrix2) {
    if (!Matrix.haveSameDimension(matrix1, matrix2)) {
      return null;
    }

    int numRows = matrix1.length;
    int numCols = matrix1[0].length;
    double[][] sumMatrix = new double[numRows][numCols];

    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        sumMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
      }
    }
    return sumMatrix;
  }

  /**
   * Subtracts 2 matrices.
   */
  public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
    if (!Matrix.haveSameDimension(matrix1, matrix2)) {
      return null;
    }

    int numRows = matrix1.length;
    int numCols = matrix1[0].length;
    int[][] sumMatrix = new int[numRows][numCols];

    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        sumMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
      }
    }
    return sumMatrix;
  }

  public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
    if (!Matrix.haveSameDimension(matrix1, matrix2)) {
      return null;
    }

    int numRows = matrix1.length;
    int numCols = matrix1[0].length;
    double[][] sumMatrix = new double[numRows][numCols];

    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        sumMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
      }
    }
    return sumMatrix;
  }

  /**
   * Multiplies 2 matrices.
   */
  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
    if (!(matrix1[0].length == matrix2.length)) {
      return null;
    }

    int numRows = matrix1.length;
    int numCols = matrix2[0].length;
    int[][] productMatrix = new int[numRows][numCols];

    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        productMatrix[row][col] = 0;
        for (int i = 0; i < matrix2.length; i++) {
          productMatrix[row][col] += matrix1[row][i] * matrix2[i][col];
        }
      }
    }
    return productMatrix;
  }

  public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
    if (!(matrix1[0].length == matrix2.length)) {
      return null;
    }

    int numRows = matrix1.length;
    int numCols = matrix2[0].length;
    double[][] productMatrix = new double[numRows][numCols];

    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        productMatrix[row][col] = 0;
        for (int i = 0; i < matrix2.length; i++) {
          productMatrix[row][col] += matrix1[row][i] * matrix2[i][col];
        }
      }
    }
    return productMatrix;
  }
}
