package test_IO;

import java.util.*;

/**
 * Created by Ser on 09.05.2017.
 */
public class SortWords {

    Map<String, Integer> uniqueWordsAndCount = new HashMap<String, Integer>();
    Integer integ = 0;
    ReadingIO_text readingIO_text;
    ArrayList<Pair> lp = new ArrayList<Pair>();
    int countUniqueWords;

    public SortWords(ReadingIO_text readingIO_text) {
        this.readingIO_text = readingIO_text;
    }
    public SortWords() {}

    public void creatingWordsMap(){

        for( String str: readingIO_text.stLnk) {
                if (uniqueWordsAndCount.containsKey(str)) {
                    uniqueWordsAndCount.put(str, uniqueWordsAndCount.get(str)+1);
                }
                else {
                    uniqueWordsAndCount.put(str, new Integer(1));
                }
        }
    }

    public void addListPair(){
        int n =0;
        creatingWordsMap();
        for (Map.Entry entry : uniqueWordsAndCount.entrySet()) {
            lp.add(new Pair((Integer)entry.getValue(), (String) entry.getKey()));

            if((Integer)entry.getValue() == 1)
                n++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("count unique words = " + n);
        System.out.println("----------------------------------------------");
        countUniqueWords = n;
    }

    public void sortListPair(){
        Collections.sort(lp);
    }

    public ArrayList<Pair> sortListPair(ArrayList<Pair> arrlp){
        Collections.sort(lp);
        return lp;
    }

    public void showListPair(int n) {
        int count = 0;
        for (Pair p: lp){
            if(count<n){
            System.out.println(p.getI() +"  ----  " + p.getS() + "    count = "+ count++);
            System.out.println("===========================================");}
        }
    }
}

