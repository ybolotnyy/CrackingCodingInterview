package main.java.edu.byn.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 3/16/17.
 */
public class PhoneNumberCharPermutations {
  public static void main(String[] args) {
    //prt(getPhoneNumberCharsPermutations("0123456789"));
    prt(getPhoneNumberCharsPermutations("0123"));
  }

  private static String getPhoneNumberCharsPermutations(String s) {
    if (s == null) return null;
    int len = s.length();
    if (len == 0) return "";

    HashMap<Character, String> dict = new HashMap<>(10);
    dict.put('0', null);
    dict.put('1', null);
    dict.put('2', "ABC");
    dict.put('3', "DEF");
    dict.put('4', "GHI");
    dict.put('5', "JKL");
    dict.put('6', "MNO");
    dict.put('7', "PQRS");
    dict.put('8', "TUV");
    dict.put('9', "WXYZ");

    ArrayList<String> result = new ArrayList<>();

    for (int i = 0; i < len -1; i++) {
      char outerLoopDigit = s.charAt(i);
      if (dict.get(outerLoopDigit) == null) continue;
      char[] outerLoopChars = dict.get(outerLoopDigit).toCharArray();
      int outerLoopCharsCount = outerLoopChars.length;

      for (int j = 0; j < len - 1; j++) {
        if (i == j) continue;  // skip self-to-self iteration
        char innerLoopDigit = s.charAt(i);
        if (dict.get(innerLoopDigit) == null) continue;
        char[] innerLoopChars = dict.get(innerLoopDigit).toCharArray();
        int innerLoopCharsCount = innerLoopChars.length;



      }
    }

    return result.toString();
  }
}
