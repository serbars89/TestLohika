package test_IO;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ser on 08.05.2017.
 */
public class ReadingIO_text {

    ResolverWords resolverWords;
    public List<String> listWords;
    StringBuffer bufferChars;
    int countChar;

    public void readFrom_file(String file) {
        bufferChars = null;
        Reader readr = null;

        try {
            readr = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            bufferChars = new StringBuffer();
            resolverWords = new ResolverWords();

            countChar = 0;
            listWords = new LinkedList<String>();
            while ((countChar = readr.read()) > 1) {

                if (resolverWords.rezolv((char) countChar) == false) {
                    bufferChars.append((char) countChar);
                } else {
                    String ss = bufferChars.toString().toUpperCase().trim();
                    if (!ss.isEmpty()) {
                        listWords.add(ss);
                    }
                    bufferChars = new StringBuffer();
                }
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (readr != null) {
                try {
                    readr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
