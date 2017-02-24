package main.java.edu.byn.strings;

import main.java.edu.byn.utils.Matrix;

public class NumToString {
  public static void main(String[] args) {
    System.out.println(numToString(321));
  }

  private static String numToString(int num) {
    StringBuffer sb = new StringBuffer();

    int len = 1;
    int i = 0;
    while (Math.pow((double) 10, (double) ++i) < num) {
      ++len;
    }

    String[] wordArray1 = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] wordArray11 = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] wordArray10 = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] wordArray100 = {"Hundred", "Thousand"};

    int reminderSum = 0;
    for (i = 0; i < len; i++) {
      int divider = (int) Math.pow((double) 10, (double) i + 1);
      // i = 1    321 % 10 = 1
      // i = 2    321 % 100 = 21     - 1 ) / 10
      // i = 2    321 % (10^i) = 21

      // i = 3    321 % 1000 = 321   - 21) / 100
      // i = 3    321 % (10^i) - 21 / 100
      // i = 3    ( 321 % (10^i) - 321 % (10^(i-1)) ) / 10^(i-1)

      int digitToConvert = (int) ((
                  num % Math.pow((double)10, (double) i)
                  - num % Math.pow((double)10, (double) i - 1))
                  / Math.pow((double)10, (double) i - 1));
      sb.insert(0, wordArray1[(int) (digitToConvert % 10) ] + " ");

    }

    return sb.toString();
  }
}
