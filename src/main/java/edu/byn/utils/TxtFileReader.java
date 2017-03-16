package main.java.edu.byn.utils;

import java.io.*;
import java.util.ArrayList;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 2/27/17.
 */
public class TxtFileReader {
  public ArrayList<String> getFileStrings(String fileName) {
/*    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource("file/" + fileName).getFileStrings());
    return file;*/

    String line = null;
    ArrayList<String> linesArray = new ArrayList<>();

    try {
      FileReader fileReader = new FileReader(fileName);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      int i = 0;
      while ((line = bufferedReader.readLine()) != null) {
        linesArray.add(line);
        //System.out.println(linesArray.get(i++));
      }

      bufferedReader.close();
    }
    catch (FileNotFoundException ex) {
      prt("Unable to open file " + fileName);
    }
    catch (IOException ex) {
      prt("Error reading file " + fileName);
    }

    return linesArray;
  }
}
