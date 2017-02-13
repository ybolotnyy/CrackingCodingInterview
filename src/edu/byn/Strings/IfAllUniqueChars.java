package edu.byn.Strings;

/**
 * Created by ybolotnyy on 2/13/17.
 */
public class IfAllUniqueChars {

  public static void main(String[] args) {
    System.out.println(ifAllUniqueChars("hello"));
    System.out.println(ifAllUniqueChars("help"));
  }

  private static boolean ifAllUniqueChars(String s) {
    /*
    * iterate through each char in the string,
    * retrieve char's int code and mark its presence in a boolean array[0-255].
    * if next char presence is true, then string has not *all* unique chars, so return false
    * */

    if (s == null) {
      System.out.println("String is null");
      return false;
    };

    System.out.println("Input string: " + s);

    int len = s.length();
    switch (len) {
      case 0: System.out.println("String is empty");
              return false;

      case 1: System.out.println("String has only one character");
              return true;
    }

    boolean[] charSet = new boolean[255];
    for (int i = 0; i < len; i++) {
      int value = s.charAt(i);
      if (charSet[value]) {
        System.out.println("String has not unique characters - " + s.charAt(i));
        return false;
      } else {
        charSet[value] = true;
      }
    }
    return true;
  }
}
