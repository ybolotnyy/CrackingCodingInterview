package main.java.edu.byn.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ybolotnyy on 3/15/17.
 */
public class MaxOccuredChar {
  public static void main(String[] args) {
    System.out.println(getMaxOccurredChar_iterative("Hello world. I love you and make you better"));
    System.out.println(getMaxOccurredChar_hashmap("Hello world. I love you and make you better"));
  }

  private static String getMaxOccurredChar_hashmap(String s) {
    if (s == null) return null;
    int len = s.length();
    if (len == 0) return null;

    HashMap<Character, Integer> map = new HashMap<>(len);

    for (int i = 0; i < len - 1; i++) {
      char currentChar = s.charAt(i);
      if (currentChar == ' ') continue;  // skip spaces from counting

      if (!map.containsKey(currentChar)) {
        map.put(currentChar, 1);
      } else {
        int charOccurCount = map.get(currentChar);
        map.put(currentChar, charOccurCount + 1);
      }
    }

    int maxCount = -1;
    Character maxOccurChar = s.charAt(0);
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      int occurCount = entry.getValue();
      if (occurCount > maxCount) {
        maxCount = occurCount;
        maxOccurChar = entry.getKey();
      }
    }

    return String.format("char '%c' occurs %d times", maxOccurChar, maxCount);
  }

  private static String getMaxOccurredChar_iterative(String s) {

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
