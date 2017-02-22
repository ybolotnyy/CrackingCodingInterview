package main.java.edu.byn.matrix;

import static main.java.edu.byn.utils.Matrix.*;

/**
 * Created by ybolotnyy on 2/16/17.
 */
public class RotateMatrix {
  public static void main(String[] args) {
    print2dMatrix(rotateSquareMatrix(getMatrix(2)));
    print2dMatrix(rotateSquareMatrix(getMatrix(5)));
    print2dMatrix(rotateSquareMatrix(getMatrix(10)));
  }

  public static int[][] rotateSquareMatrix(int[][] m) {
    int size = m.length;

    for (int layer = 0; layer < (size / 2); layer++) {
      // rotate by layer starting from corners going clockwise
      for (int offset = 0; offset < size -1 - layer * 2; offset++) {
        int t = m[layer][layer + offset];
        // left top corner <= left bottom corner
        m[layer][layer + offset] = m[size - 1 - layer - offset][layer];
        // left bottom <= right bottom
        m[size - 1 - layer - offset][layer] = m[size - 1 - layer][size - 1 - layer - offset];
        // right bottom <= right top
        m[size - 1 - layer][size - 1 - layer - offset] = m[layer + offset][size - 1 - layer];
        // right top  = left top, saved in temp
        m[layer + offset][size - 1 - layer] = t;
      }
    }

    return m;
  }
}
