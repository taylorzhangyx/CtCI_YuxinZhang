package JavaBasics;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SingleComparator implements Comparator<SingleCom> {
    List<SingleCom> listToTest;
    SingleCom o1 = new SingleCom("a");
    SingleCom o2 = new SingleCom("b");
    SingleCom o3 = new SingleCom("c");

    @Override
    public int compare(SingleCom o1, SingleCom o2) {
        return o1.value.compareTo(o2.value);
    }

    @Before
    public void prep() {
        listToTest = Arrays.asList(o3, o2, o1);
    }

    @Test
    public void SingleComTest1() {

        listToTest.sort(new SingleComparator());
        assertArrayEquals(new SingleCom[] { o1, o2, o3 }, listToTest.toArray());
    }

    @Test
    public void SingleComTest2() {
        listToTest.sort((o1, o2) -> o1.value.compareTo(o2.value));
        assertArrayEquals(new SingleCom[] { o1, o2, o3 }, listToTest.toArray());
    }
}