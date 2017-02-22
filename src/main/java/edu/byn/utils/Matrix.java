package main.java.edu.byn.utils;

/**
 * Created by ybolotnyy on 2/16/17.
 */
public class Matrix {
  public static int[][] getMatrix(int size) {
    int[][] m = new int[size][size];

    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        m[y][x] = x;
      }
    }

    return m;
  }

  public static int[][] getMatrix(int size, int offset) {
    int[][] m = new int[size][size];

    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        m[y][x] = x + offset;
      }
    }

    return m;
  }

  public static void print2dMatrix(int[][] m) {
    int rowsNum = m.length;
    int columnsNum = m[0].length;
    System.out.printf("Matrix %d x %d \n", columnsNum, rowsNum);

    for (int row = 0; row < rowsNum; row++) {
      for (int column = 0; column < columnsNum; column++) {
        System.out.printf("%2d ", m[row][column]);
      }
      System.out.println();
    }
  }
}
