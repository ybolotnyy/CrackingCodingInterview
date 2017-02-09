package edu.byn.Strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ybolotnyy on 2/8/17.
 */
public class ExtractDigitsSumFromString {

  public static void main(String[] args) {
    System.out.println("Enter a string contains some numbers");
    Scanner in = new Scanner(System.in);
    String str = in.next();

    if (str == null || str.length() == 0) str = "ab123def45gh32";

    System.out.println(extractSumFromString(str));
  }

  private static int extractSumFromString(String s) {
    if (s == null) return 0;

    int length = s.length();
    if (length == 0) return 0;

    boolean isDigit = false;
    int sum = 0;
    int decimalPlace = 0;
    ArrayList<Integer> valuesList = new ArrayList<Integer>();

    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);

      if (('0' <= c) && (c <= '9')) {
        isDigit = true;
        int value = Character.getNumericValue(c);

        if (decimalPlace == 0) {
          sum = value;
        } else {
          sum = sum * 10 + value;
        }

        decimalPlace++;

      } else isDigit = false;

      if ((!isDigit && decimalPlace > 0) || (i == length - 1)) {
        // flush sum to a linked list
        valuesList.add(sum);
        sum = 0;
        decimalPlace = 0;
      }
    }

    int total = 0;
    for (int i = 0; i < valuesList.size(); i++) {
      if (i == 0) {
        System.out.print(valuesList.get(i) );
      } else {
        System.out.print(" + " + valuesList.get(i));
      }
      total = total + valuesList.get(i);
    }

    System.out.print(" = ");

    return total;
  }
}
