package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2)) * ( -1) ;
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>(new MyCompare());
        set.add("add");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);
    }
}
