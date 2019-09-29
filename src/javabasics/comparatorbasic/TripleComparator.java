package javabasics.comparatorbasic;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TripleComparator {
    TripleCom o1 = new TripleCom("a", 1, 1);
    TripleCom o2 = new TripleCom("a", 2, 2);
    TripleCom o3 = new TripleCom("a", 2, 3);
    TripleCom o4 = new TripleCom("b", 2, 2);
    TripleCom o5 = new TripleCom("c", 1, 1);
    List<TripleCom> listToSort;

    @Before
    public void prep() {
        listToSort = Arrays.asList(o5, o3, o2, o1, o4);
    }

    @Test
    public void nameFirstTest() {
        listToSort.sort((o1, o2) -> {
            if (o1.name != o2.name) {
                return o1.name.compareTo(o2.name);
            } else if (o1.price != o2.price) {
                return o1.price > o2.price ? 1 : -1;
            } else {
                return o1.rate - o2.rate;
            }
        });
        assertArrayEquals(new TripleCom[] { o1, o2, o3, o4, o5 }, listToSort.toArray());
    }

    @Test
    public void priceFirstTest() {
        listToSort.sort((o1, o2) -> {
            if (o1.price != o2.price) {
                return o1.price > o2.price ? 1 : -1;
            } else if (o1.name != o2.name) {
                return o1.name.compareTo(o2.name);
            } else {
                return o1.rate - o2.rate;
            }
        });
        assertArrayEquals(new TripleCom[] { o1, o5, o2, o3, o4 }, listToSort.toArray());
    }

    @Test
    public void rateFirstTest() {
        listToSort.sort((o1, o2) -> {
            if (o1.rate != o2.rate) {
                return o1.rate - o2.rate;
            } else if (o1.price != o2.price) {
                return o1.price > o2.price ? 1 : -1;
            } else {
                return o1.name.compareTo(o2.name);
            }
        });
        assertArrayEquals(new TripleCom[] { o1, o5, o2, o4, o3 }, listToSort.toArray());
    }
}