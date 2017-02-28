package main.java.edu.byn.strings;

import main.java.edu.byn.utils.TxtFileReader;

import java.util.ArrayList;
import java.util.Hashtable;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 2/26/17.
 */
public class WordOccurencesFrequency {

  public static void main(String[] args) {
    ArrayList<String> al = new TxtFileReader().getFileStrings("./src/main/resources/file/bible.txt");
    System.out.println(prepareDictionary(al));
  }

  private static boolean prepareDictionary(ArrayList<String> textArray) {
    if (textArray == null || textArray.size() == 0) return false;

    Hashtable<String, Integer> ht = new Hashtable<>();

    for (String string : textArray) {
      for (String word : string.split("\\W+")) {
        word = word.toLowerCase();
        prt(word);
        if (!ht.containsKey(word)) {
          ht.put(word, 1);
        } else {
          int occur = ht.get(word);
          prt("word '" + word +  "' occurs " + occur + " times");
          ht.put(word, ht.get(word) + 1);
        }
      }
    }

    return true;
  }

}
