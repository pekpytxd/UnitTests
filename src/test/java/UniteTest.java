import org.junit.Test;
import tests.OperationsSets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UniteTest {

    @org.junit.Test
    public void unite() throws Exception {
        OperationsSets obj = new OperationsSets();
        Set s1 = new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set s2 = new HashSet();
        s2.add(4);
        s2.add(5);
        s2.add(3);
        Set actual = obj.union(s1, s2);
        Set expected = new HashSet();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void intersect() throws Exception{
        OperationsSets obj = new OperationsSets();
        Set s1 = new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set s2 = new HashSet();
        s2.add(4);
        s2.add(5);
        s2.add(3);
        Set actual = obj.intersect(s1, s2);
        Set expected = new HashSet();
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, actual);
    }
}