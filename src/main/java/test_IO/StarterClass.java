package test_IO;

/**
 * Created by SER on 02.06.2015.
 */
public class StarterClass {

    public static void main( String[] args )
    {

        ReadingIO_text readingIO_text = new ReadingIO_text();
        readingIO_text.readFrom_file("d:\\test\\new2_2.txt");

        SortWords sortWords = new SortWords(readingIO_text);
        sortWords.addListPair();
        sortWords.sortListPair();
        sortWords.showListPair(sortWords.countUniqueWords);

    }
}
