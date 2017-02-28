package main.java.edu.byn.strings;

import main.java.edu.byn.utils.TxtFileReader;

import java.util.*;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 2/26/17.
 */
public class WordOccurencesFrequency {

  public static void main(String[] args) {
    ArrayList<String> al = new TxtFileReader().getFileStrings("./src/main/resources/file/bible.txt");
    Hashtable<String, Integer> ht = prepareDictionary(al);

    // Get a set of the entries
    Set set = ht.entrySet();
    // Get an iterator
    Iterator i = set.iterator();
    // Display elements
    while(i.hasNext()) {
      Map.Entry me = (Map.Entry) i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }

  }

  private static Hashtable<String, Integer> prepareDictionary(ArrayList<String> textArray) {
    if (textArray == null || textArray.size() == 0) return null;

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

    return ht;
  }

}