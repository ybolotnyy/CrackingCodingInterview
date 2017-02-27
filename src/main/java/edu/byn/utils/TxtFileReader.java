package main.java.edu.byn.utils;

import java.io.*;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 2/27/17.
 */
public class TxtFileReader {
  public void getFile(String fileName) {
/*    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource("file/" + fileName).getFile());
    return file;*/

    String line = null;

    try {
      FileReader fileReader = new FileReader(fileName);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      bufferedReader.close();
    }
    catch (FileNotFoundException ex) {
      prt("Unable to open file " + fileName);
    }
    catch (IOException ex) {
      prt("Error reading file " + fileName);
    }
  }
}
