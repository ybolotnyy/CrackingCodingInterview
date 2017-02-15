package main.java.edu.byn.strings;

/**
 * Created by ybolotnyy on 2/14/17.
 */
public class IfTwoStringAnagrams {
  /*a word, phrase, or name formed by rearranging the letters of another,
   such as cinema, formed from iceman; listen vs silent; solve vs loves*/

  public static void main(String[] args) {
    System.out.println(ifTwoStringsAnagram("listen", "silent"));
  }

  private static boolean ifTwoStringsAnagram(String s, String s1) {
    System.out.printf("checking '%s' is anagram of '%s' - ", s, s1);

    int[] letters = new int[256];
    int uniqueLetters = 0;

    for (int i = 0; i < s.length(); i++) {
      int value = s.charAt(i);
      if (letters[value] == 0) {
        ++uniqueLetters;
      }
      ++letters[value];
    }

    for (int i = 0; i < s1.length(); i++) {
      int value = s1.charAt(i);
      --letters[value];
      if (letters[value] < 0) { // this letter not found in s
        return false;
      } else --uniqueLetters;
    }

    return uniqueLetters == 0;
  }
}
