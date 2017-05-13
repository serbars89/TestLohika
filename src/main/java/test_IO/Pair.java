package test_IO;

/**
 * Created by Ser on 10.05.2017.
 */
public class Pair implements Comparable<Pair>{

    private Integer i;
    private String s;


    public Pair() {
    }

    public Pair(Integer i, String s) {
        this.i = i;
        this.s = s;
    }


    public Integer getI() {
        return i;
    }

    public String getS() {
        return s;
    }

    @Override
    public int compareTo(Pair o) {
        return o.getI() - i ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (!i.equals(pair.i)) return false;
        return s.equals(pair.s);

    }

    @Override
    public int hashCode() {
        int result = i.hashCode();
        result = 31 * result + s.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}
