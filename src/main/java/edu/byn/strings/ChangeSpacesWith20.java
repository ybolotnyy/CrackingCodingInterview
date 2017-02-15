package main.java.edu.byn.strings;

/**
 * Created by ybolotnyy on 2/15/17.
 */
public class ChangeSpacesWith20 {
  public static void main(String[] args) {
    System.out.println(changeSpacesWith20("hello world how are you"));
  }

  private static String changeSpacesWith20(String s) {
    if (s == null) return null;
    int len = s.length();
    if (len == 0) return s;

    int numOfSpaces = 0;
    for (int i = 0; i < len; i++) {
      if (s.charAt(i) == ' ') {
        ++numOfSpaces;
      }
    }

    int newLen = len + numOfSpaces * 3 - numOfSpaces;
    char[] str = new char[newLen];
    int j = 0;
    for (int i = 0; i < len; i++) {
      char letter = s.charAt(i);
      if (letter == ' ') {
        str[j++] = '%';
        str[j++] = '2';
        str[j++] = '0';
      } else str[j++] = letter;
    }

    return new String(str);
  }
}
