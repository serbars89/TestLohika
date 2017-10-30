package test_IO;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.apache.commons.lang3.StringUtils.isEmpty;

/**
 * Created by Ser on 11.05.2017.
 */
public class TestSortWords {
    SortWords sortWords = new SortWords();
    Pair pair = new Pair();

    List<Pair> arrayList_ = new ArrayList<Pair>();
    List<Pair> arrayList_p_ = new ArrayList<Pair>();

    public List<Pair> add() {
        arrayList_p_.add(new Pair(8, "daa"));
        arrayList_p_.add(new Pair(4, "djj"));
        arrayList_p_.add(new Pair(7, "dee"));
        return arrayList_p_;
    }

    @Test
    public void test_addListPair_1() {
        List<Pair> arrayList = null;
        List<Pair> arrayList_p = null;

        arrayList = sortWords.sortListPair(arrayList_p);

        Assert.assertTrue("Object successful", arrayList.isEmpty());

    }

    @Test
    public void test_sortListPair() {

        Assert.assertFalse("Object successful", add().isEmpty());

    }
}
