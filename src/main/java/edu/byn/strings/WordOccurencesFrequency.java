package main.java.edu.byn.strings;

import main.java.edu.byn.utils.TxtFileReader;

import java.util.*;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 2/26/17.
 */
public class WordOccurencesFrequency {

  public static void main(String[] args) {
    ArrayList<String> fileStrings = new TxtFileReader().getFileStrings("./src/main/resources/file/bible.txt");
    Hashtable<String, Integer> ht = prepareDictionary(fileStrings);
    getTop100(ht);
  }

  private static boolean getTop100(Hashtable<String, Integer> ht) {
    System.out.printf("\n HashTable size is %d \n\n", ht.size());

    Hashtable<Integer, String> top100 = new Hashtable<>(100);
    String[] skipThisWords = new String[] {"and", "the", "of", "to", "in", "on", "that", "he", "she"};
    int[] topValues = new int[100];

    int maxValue = Integer.MIN_VALUE;


    String maxKey = "";
    Enumeration e = ht.keys();

    int i = 0;
    while (e.hasMoreElements()) {
      i++;
      String key = e.nextElement().toString();
      int value = ht.get(key);

//      System.out.println(key + " === " + value);
      Arrays.asList(skipThisWords).contains(key);

      if (value > maxValue && !Arrays.asList(skipThisWords).contains(key))  {
        maxValue = value;
        maxKey = key;
        System.out.printf("%d)   Top is '%s' ==>> %d \n", i, maxKey, maxValue);
      } else {
        System.out.printf("%d)   skip '%s' since %d << %d \n", i, key, value, maxValue);
      }

    }

    System.out.printf("Top is '%s' - %d", maxKey, maxValue);
    System.out.printf("\n %d", i);
    return false;
  }

  private static Hashtable<String, Integer> prepareDictionary(ArrayList<String> textArray) {
    if (textArray == null || textArray.size() == 0) return null;

    Hashtable<String, Integer> ht = new Hashtable<>();

    for (String string : textArray) {
      for (String word : string.split("\\W+")) {
        word = word.toLowerCase();
        //prt(word);
        if (!ht.containsKey(word)) {
          ht.put(word, 1);
        } else {
          int occur = ht.get(word);
          prt("'" + word +  "' occurs " + occur + " times");
          ht.put(word, ht.get(word) + 1);
        }
      }
    }

    System.out.printf("\n HashTable size is %d \n\n", ht.size());
    return ht;
  }

}