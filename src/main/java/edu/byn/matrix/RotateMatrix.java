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

    int[][] matrix1 = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
    };

    print2dMatrix(matrix1);
    rotateSquareMatrix(matrix1);
    print2dMatrix(matrix1);
  }

  public static int[][] rotateSquareMatrix(int[][] m) {
    int size = m.length;

    for (int layer = 0; layer < (size / 2); layer++) {
      // rotate by layer starting from corners going clockwise
      for (int offset = 0; offset < size - 1 - layer * 2; offset++) {
        int t = m[layer + 0][layer + 0 + offset];
        m[layer + 0][layer + 0 + offset] = m[size - 1 - layer - offset][layer + 0];
        m[size - 1 - layer - offset][layer + 0] = m[size - 1 - layer][size - 1 - layer - offset];
        m[size - 1 - layer][size - 1 - layer - offset] = m[layer + 0 + offset][size - 1 - layer];
        m[layer + 0 + offset][size - 1 - layer] = t;

//        System.out.printf("\n layer=%d; offset=%d \n", layer, offset);
//        print2dMatrix(m);
      }
    }

    return m;
  }
}
