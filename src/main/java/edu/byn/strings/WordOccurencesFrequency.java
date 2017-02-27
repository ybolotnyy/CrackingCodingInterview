package main.java.edu.byn.strings;

import main.java.edu.byn.utils.TxtFileReader;

import static main.java.edu.byn.utils.Print.prt;

/**
 * Created by ybolotnyy on 2/26/17.
 */
public class WordOccurencesFrequency {
  public static String txt = "Genesis 1:1\tIn the beginning God created the heaven and the earth.\n" +
          "Genesis 1:2\tAnd the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.\n" +
          "Genesis 1:3\tAnd God said, Let there be light: and there was light.\n" +
          "Genesis 1:4\tAnd God saw the light, that it was good: and God divided the light from the darkness.\n" +
          "Genesis 1:5\tAnd God called the light Day, and the darkness he called Night. And the evening and the morning were the first day.\n" +
          "Genesis 1:6\tAnd God said, Let there be a firmament in the midst of the waters, and let it divide the waters from the waters.\n" +
          "Genesis 1:7\tAnd God made the firmament, and divided the waters which were under the firmament from the waters which were above the firmament: and it was so.\n" +
          "Genesis 1:8\tAnd God called the firmament Heaven. And the evening and the morning were the second day.\n" +
          "Genesis 1:9\tAnd God said, Let the waters under the heaven be gathered together unto one place, and let the dry land appear: and it was so.\n" +
          "Genesis 1:10\tAnd God called the dry land Earth; and the gathering together of the waters called he Seas: and God saw that it was good.\n" +
          "Genesis 1:11\tAnd God said, Let the earth bring forth grass, the herb yielding seed, and the fruit tree yielding fruit after his kind, whose seed is in itself, upon the earth: and it was so.\n" +
          "Genesis 1:12\tAnd the earth brought forth grass, and herb yielding seed after his kind, and the tree yielding fruit, whose seed was in itself, after his kind: and God saw that it was good.\n" +
          "Genesis 1:13\tAnd the evening and the morning were the third day.\n" +
          "Genesis 1:14\tAnd God said, Let there be lights in the firmament of the heaven to divide the day from the night; and let them be for signs, and for seasons, and for days, and years:\n" +
          "Genesis 1:15\tAnd let them be for lights in the firmament of the heaven to give light upon the earth: and it was so.\n" +
          "Genesis 1:16\tAnd God made two great lights; the greater light to rule the day, and the lesser light to rule the night: he made the stars also.\n" +
          "Genesis 1:17\tAnd God set them in the firmament of the heaven to give light upon the earth,\n" +
          "Genesis 1:18\tAnd to rule over the day and over the night, and to divide the light from the darkness: and God saw that it was good.\n" +
          "Genesis 1:19\tAnd the evening and the morning were the fourth day.\n" +
          "Genesis 1:20\tAnd God said, Let the waters bring forth abundantly the moving creature that hath life, and fowl that may fly above the earth in the open firmament of heaven.\n" +
          "Genesis 1:21\tAnd God created great whales, and every living creature that moveth, which the waters brought forth abundantly, after their kind, and every winged fowl after his kind: and God saw that it was good.\n" +
          "Genesis 1:22\tAnd God blessed them, saying, Be fruitful, and multiply, and fill the waters in the seas, and let fowl multiply in the earth.\n" +
          "Genesis 1:23\tAnd the evening and the morning were the fifth day.\n" +
          "Genesis 1:24\tAnd God said, Let the earth bring forth the living creature after his kind, cattle, and creeping thing, and beast of the earth after his kind: and it was so.\n" +
          "Genesis 1:25\tAnd God made the beast of the earth after his kind, and cattle after their kind, and every thing that creepeth upon the earth after his kind: and God saw that it was good.\n" +
          "Genesis 1:26\tAnd God said, Let us make man in our image, after our likeness: and let them have dominion over the fish of the sea, and over the fowl of the air, and over the cattle, and over all the earth, and over every creeping thing that creepeth upon the earth.\n" +
          "Genesis 1:27\tSo God created man in his own image, in the image of God created he him; male and female created he them.\n" +
          "Genesis 1:28\tAnd God blessed them, and God said unto them, Be fruitful, and multiply, and replenish the earth, and subdue it: and have dominion over the fish of the sea, and over the fowl of the air, and over every living thing that moveth upon the earth.\n" +
          "Genesis 1:29\tAnd God said, Behold, I have given you every herb bearing seed, which is upon the face of all the earth, and every tree, in the which is the fruit of a tree yielding seed; to you it shall be for meat.\n" +
          "Genesis 1:30\tAnd to every beast of the earth, and to every fowl of the air, and to every thing that creepeth upon the earth, wherein there is life, I have given every green herb for meat: and it was so.";

  public static void main(String[] args) {
    prt(txt);
    System.out.println(wordOccurencesFrequency(txt));
  }

  private static boolean wordOccurencesFrequency(String txt) {
    TxtFileReader txtFileReader = new TxtFileReader();
    txtFileReader.getFile("./src/main/resources/file/bible.txt");
    return false;
  }


}
