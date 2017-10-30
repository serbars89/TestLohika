package test_IO;

import java.util.*;

/**
 * Created by Ser on 09.05.2017.
 */
public class SortWords {

    Map<String, Integer> uniqueWordsAndCount = new HashMap<String, Integer>();
    Integer integ = 0;
    ReadingIO_text readingIO_text;
    List<Pair> listPair = new ArrayList<Pair>();
    int countUniqueWords;

    public SortWords(ReadingIO_text readingIO_text) {
        this.readingIO_text = readingIO_text;
    }

    public SortWords() {
    }

    public void creatingWordsMap() {

        for (String str : readingIO_text.listWords) {
            if (uniqueWordsAndCount.containsKey(str)) {
                uniqueWordsAndCount.put(str, uniqueWordsAndCount.get(str) + 1);
            } else {
                uniqueWordsAndCount.put(str, new Integer(1));
            }
        }
    }

    public void addListPair() {
        int n = 0;
        creatingWordsMap();
        for (Map.Entry entry : uniqueWordsAndCount.entrySet()) {
            listPair.add(new Pair((Integer) entry.getValue(), (String) entry.getKey()));

            if ((Integer) entry.getValue() == 1)
                n++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("count unique words = " + n);
        System.out.println("----------------------------------------------");
        countUniqueWords = n;
    }

    public void sortListPair() {
        Collections.sort(listPair);
    }

    public List<Pair> sortListPair(List<Pair> arrlp) {
        Collections.sort(listPair);
        return listPair;
    }

    public void showListPair(int n) {
        int count = 0;
        for (Pair p : listPair) {
            if (count < n) {
                System.out.println(p.getI() + "  ----  " + p.getS() + "    count = " + count++);
                System.out.println("===========================================");
            }
        }
    }
}

