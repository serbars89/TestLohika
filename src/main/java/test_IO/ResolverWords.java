package test_IO;

/**
 * Created by Ser on 08.05.2017.
 */
public class ResolverWords {
    final char s1 = ' ';
    final char s2 = '.';
    final char s3 = ',';
    private char c;
    boolean end_words;

    public ResolverWords(char c) {
        this.c = c;
    }

    public ResolverWords() {
    }

    public boolean rezolv(char s) {
        c = s;
        switch (c) {
            case s1:
                end_words = true;
                break;

            case s2:
                end_words = true;
                break;

            case s3:
                end_words = true;
                break;

            default:
                end_words = false;
        }
        return end_words;
    }
}
