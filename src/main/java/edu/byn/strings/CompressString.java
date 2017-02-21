package main.java.edu.byn.strings;

/**
 * Created by ybolotnyy on 2/17/17.
 */
public class CompressString {
  public static void main(String[] args) {
    System.out.println(compressString("aaaabbbbcddd".toCharArray()));
  }

  private static String compressString(char[] s) {
    int len = s.length;
//     save first char to output array
    char[] output =
//     scan string char by char starting from 2nd char
//     if current char is dupe of previous,
//       increment dupesCounter
//     if current char become not dupe of previous,
//       add number of dupes (as digit) to output
//       reset dupesCounter

    return new String(s);
  }
}
