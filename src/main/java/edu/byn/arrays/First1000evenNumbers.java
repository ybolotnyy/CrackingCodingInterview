package main.java.edu.byn.arrays;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 3/15/17.
 */
public class First1000evenNumbers {
  public static void main(String[] args) {
    prt(first1000evenNumbers());
  }

  private static String first1000evenNumbers() {
    ArrayList<Integer> evenNumbers = new ArrayList<>();

    for (int i = 2; i <= 1000; i++) {
      if (i % 2 == 0) evenNumbers.add(i);
    }
    return evenNumbers.toString();
  }
}
