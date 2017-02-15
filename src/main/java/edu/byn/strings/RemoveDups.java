package main.java.edu.byn.strings;

import java.util.Arrays;

/**
 * Created by ybolotnyy on 2/9/17.
 */
public class RemoveDups {
  public static void main(String[] args) {
    System.out.println(removeDups("hheeeeeellooooo"));
  }

  public static String removeDups(String s) {
    /*
    * iterate each char in the sing
    * use a character's integer code as index to reflect character presence in [256] boolean array
    * if character presence is True then it's a dup, so remove it
    * */
    System.out.println("input string: " + s);

    if (s == null) return null;
    int length = s.length();
    if (length == 0 || length == 1) return s;

    boolean[] charSet = new boolean[256];
    char[] checkedChars = new char[length];

    int numDupedChars = 0;
    for (int i = 0; i < length; i++) {
      int value = s.charAt(i);
      if (!charSet[value]) { // char wasn't seen before, so not a dupe
        charSet[value] = true;
        checkedChars[i - numDupedChars] = s.charAt(i);
      } else {
        numDupedChars++;
      }
    }

    return new String(Arrays.copyOfRange(checkedChars, 0, length - numDupedChars));
  }
}
