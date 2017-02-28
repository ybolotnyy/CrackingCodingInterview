package main.java.edu.byn.strings;

import main.java.edu.byn.utils.TxtFileReader;

import java.util.ArrayList;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 2/26/17.
 */
public class WordOccurencesFrequency {

  public static void main(String[] args) {
    ArrayList<String> al = new TxtFileReader().getFileStrings("./src/main/resources/file/bible.txt");
    System.out.println(wordOccurencesFrequency(al));
  }

  private static boolean wordOccurencesFrequency(ArrayList<String> textArray) {

    if (textArray == null || textArray.size() == 0) return false;


    return true;
  }


}
