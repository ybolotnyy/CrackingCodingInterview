package main.java.edu.byn.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ybolotnyy on 2/26/17.
 */
public class SequenceLargestSum {
  public static void main(String[] args) {
    int[] ar = new int[] {2, 3, -8, -1, 2, 4, -2, 3};
    System.out.println(Arrays.toString(ar));
    System.out.println("\n" + sequenceLargerSum(ar));
  }

  private static int sequenceLargerSum(int[] ar) {
    int sum = 0;
    int maxSum = 0;

    for (int i = 0; i < ar.length; i++) {
      System.out.printf("sum = %d + %d = ", sum, ar[i]);
      sum += ar[i];
      System.out.printf("%d   ; maxSum = %d \n", sum, maxSum);
      if (maxSum < sum) {
        maxSum = sum;
        //System.out.print(ar[i] + " ");
      } else if (sum < 0) {
        sum = 0;
      }
    }

    return maxSum;
  }
}
