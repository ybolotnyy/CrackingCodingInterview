package edu.byn.Strings;

import java.util.Arrays;

/**
 * Created by ybolotnyy on 2/13/17.
 */
public class ReverseString {

  public static void main(String[] args) {
    System.out.println(reverseString("olleh"));
  }

  private static String reverseString(String s) {

    if (s == null) return null;
    System.out.println("Input string: " + s);
    int len = s.length();
    if (len == 0) return "";
    if (len == 1) return s;

    int left = 0;
    int right = len - 1;
    char[] chStr = s.toCharArray();
    while (left < right) {
      char temp = chStr[left];
      chStr[left] = chStr[right];
      chStr[right] = temp;
      left++;
      right--;
    }

    return new String(chStr);
  }
}
