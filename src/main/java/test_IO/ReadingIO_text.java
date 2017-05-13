package test_IO;

import java.io.*;
import java.util.LinkedList;

/**
 * Created by Ser on 08.05.2017.
 */
public class ReadingIO_text {

    ResolverWords resolverWords;

  public LinkedList<String> stLnk;

    public void readFrom_file(String file) {
        StringBuffer strBuff = null;
        Reader readr = null;

        try {
            readr = new BufferedReader(new InputStreamReader( new FileInputStream(file), "UTF-8"));
            strBuff = new StringBuffer();
            resolverWords = new ResolverWords();
            int chr = 0;
            stLnk = new LinkedList<String>();
            while ((chr = readr.read())>1 ){
//                System.out.print((char) chr);

                if (resolverWords.rezolv((char) chr) == false){
                        strBuff.append((char) chr);
                }
                else{
                        String ss = strBuff.toString().toUpperCase().trim();
                        if(!ss.isEmpty()){
                            stLnk.add(ss);
                         }
                    strBuff = new StringBuffer();
                }
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (readr != null){
                try {
                    readr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
