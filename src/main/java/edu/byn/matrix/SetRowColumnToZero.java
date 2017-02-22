package main.java.edu.byn.matrix;

import static main.java.edu.byn.utils.Matrix.*;

/**
 * Created by ybolotnyy on 2/17/17.
 */
public class SetRowColumnToZero {
  public static void main(String[] args) {
    int[][] matrix = getMatrix(10, 1);
    matrix[3][3] = 0;
    matrix[9][9] = 0;

    print2dMatrix(matrix);
    print2dMatrix(zeroRowColumns(matrix));
  }

  private static int[][] zeroRowColumns(int[][] m) {
    int size = m.length;
    boolean[] rowBeZeroied = new boolean[size];
    boolean[] columnBeZeroied = new boolean[size];

    // scan matrix
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        if (m[y][x] == 0) {
          rowBeZeroied[y] = true;
          columnBeZeroied[x] = true;
        }
      }
    }

    // zeroing rows and columns
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        if (rowBeZeroied[y]) {
          m[y][x] = 0;
        }
        if (columnBeZeroied[x]) {
          m[y][x] = 0;
        }
      }
    }

    return m;
  }
}
