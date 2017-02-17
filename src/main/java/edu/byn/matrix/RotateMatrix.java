package main.java.edu.byn.matrix;

import static main.java.edu.byn.utils.Utils.*;

/**
 * Created by ybolotnyy on 2/16/17.
 */
public class RotateMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5}
    };

    print2dMatrix(matrix);

    rotateSquareMatrix(matrix);

    print2dMatrix(matrix);

  }

  public static int[][] rotateSquareMatrix(int[][] m) {
    int rows = m.length;
    int columns = m[0].length;
    int size = m.length;

    // rotate by layer starting from corners going clockwise
    for (int offset = 0; offset < size - 1; offset++) {
      int t = m[0][0 + offset];
      m[0][0 + offset] = m[size - 1 - offset][0];
      m[size - 1 - offset][0] = m[size - 1][size - 1 - offset];
      m[size - 1][size - 1 - offset] = m[0 + offset][size - 1];
      m[0 + offset][size - 1] = t;
    }

    return m;
  }
}
