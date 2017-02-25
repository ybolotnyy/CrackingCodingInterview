package main.java.edu.byn.strings;

import main.java.edu.byn.utils.Matrix;
import main.java.edu.byn.utils.Print;

import static main.java.edu.byn.utils.Print.prt;

public class NumToString {
  public static void main(String[] args) {
    System.out.println(numToString(9325));
  }

  private static String numToString(int num) {
    StringBuffer sb = new StringBuffer();

    int len = 0;
    while (Math.pow((double) 10, (double) ++len) < num) {
    }

    String[] wordArray1 = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] wordArray11 = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] wordArray10 = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] wordArray100 = {"Hundred", "Thousand"};

      // i = 2    321 % 100 = 21 / 10 = int 2
      //          (num % 100) / 10^1
      //          (num % 10^i) / 10^(i-1)
    int word11 = num % 100;

    for (int i = len; i > 0; i--){
      int digit = (int) ((num % Math.pow(10,i)) / Math.pow(10,i-1));

      if (i > 2 || ( i == 1 && word11 > 20)) {
        sb.append(wordArray1[digit - 1] + " ");
      }
      if (i > 3) {
        sb.append(wordArray100[1] + " ");
      } else if (i > 2) {
        sb.append(wordArray100[0] + " ");
      }  else if (i > 1 && digit > 1) {
        sb.append(wordArray10[digit - 1] + " ");
      } else if (i == 1 && word11 < 20) {
        sb.append(wordArray11[digit - 1] + " ");
      }
    }

    return sb.toString();
  }
}
