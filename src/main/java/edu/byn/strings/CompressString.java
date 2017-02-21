package main.java.edu.byn.strings;

import java.util.ArrayList;

/**
 * Created by ybolotnyy on 2/17/17.
 */
public class CompressString {
  public static void main(String[] args) {
    System.out.println(compressString("aaaabbbbcddd".toCharArray()));
  }

  private static String compressString(char[] s) {
    int len = s.length;
    StringBuilder out = new StringBuilder();
//     save first char to output array
    ArrayList<Character> output = new ArrayList<>();
    out.append(s[0]);
    int dupesCount = 0;
    // scan string char by char starting from 2nd char
    for (int i = 1; i < len; i++) {
      char currentChar = s[i];
      char previousChar = s[i-1];
      // if current char is dupe of previous,
      if (currentChar == previousChar) {
        // increment dupesCounter
        dupesCount++;
      } else if (currentChar != previousChar && dupesCount > 0){
        // if current char become not dupe of previous,
        // add number of dupes (as digit) to output
        // reset dupesCounter
        System.out.printf("% dupes of %s found \n", dupesCount, previousChar);
        out.append(dupesCount);
        out.append(currentChar);
        dupesCount = 0;
      } else
        out.append(currentChar);
    }

    if (dupesCount > 0) {
      out.append(dupesCount);
    }

    return out.toString();
  }
}
