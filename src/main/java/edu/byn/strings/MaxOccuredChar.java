package main.java.edu.byn.strings;

/**
 * Created by ybolotnyy on 3/15/17.
 */
public class MaxOccuredChar {
  public static void main(String[] args) {
    System.out.println(getMaxOccurredChar("Hello world. I make you better"));
  }

  private static String getMaxOccurredChar(String s) {

    if (s == null) return null;
    int len = s.length();
    if (len == 0) return null;

    char maxOccurChar = ' ';
    int maxOccurCharCount = 0;

    for (int i = 0; i < len - 1; i++) {
      char outerLoopChar = s.charAt(i);
      if (outerLoopChar == ' ') continue;

      int charOccurCount = 1;

      for (int j = 0; j < len - 1; j++) {
        char innerLoopChar = s.charAt(j);
        if (i == j) continue;   // avoid self-to-self comparison

        if (innerLoopChar == outerLoopChar) {
          charOccurCount++;
          if (charOccurCount > maxOccurCharCount) {
            maxOccurCharCount = charOccurCount;
            maxOccurChar = outerLoopChar;
          }
        }
      }
    }

    return String.format("char '%c' occurs %d times", maxOccurChar, maxOccurCharCount);
  }
}
