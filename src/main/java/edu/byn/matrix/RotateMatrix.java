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
    for (int layer = 0; layer < size / 2; layer++) {
      for (int offset = 0; offset < size / 2; offset++) {
        int tmp = m[layer][offset];
        m[layer][offset] = m[size-1-offset][offset];
        m[size-1-offset][offset] = m[size-1-layer][size-1-offset];
        m[size-1-layer][size-1-offset] = m[layer+offset][size-1-offset];
        m[layer+offset][size-1-offset] = tmp;
      }
    }


/*
    int tmp = m[0][0]; // tmp = m[layer][offset]
    m[0][0] = m[4][0]; // m[layer][offset] = m[size-1-offset][offset]
    m[4][0] = m[4][4]; // m[size-1-offset][offset] = m[size-1-layer][size-1-offset]
    m[4][4] = m[0][4]; // m[size-1-layer][size-1-offset] = m[layer+offset][size-1-offset]
    m[0][4] = tmp;*/

    return m;
  }
}
