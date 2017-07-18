package test_IO;

import junit.framework.Assert;
import org.junit.Test;

import static org.apache.commons.lang3.StringUtils.isEmpty;

/**
 * Created by Ser on 11.05.2017.
 */
public class TestResolverWords {

    ResolverWords resolverWords = new ResolverWords();
    @Test
    public void TestResolverWords_1(){
        char c = ' ';
        Assert.assertTrue("Object successful", resolverWords.rezolv(c));
    }

    @Test
    public void TestResolverWords_2(){
        char c = '5';
        Assert.assertFalse("Object successful", resolverWords.rezolv(c));
    }
}
