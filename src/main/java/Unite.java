import tests.OperationsSets;

import java.util.HashSet;
import java.util.Set;

public class Unite {
    public static void main(String[] args) {
        OperationsSets obj = new OperationsSets();
        Set s1 = new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set s2 = new HashSet();
        s2.add(4);
        s2.add(5);
        s2.add(3);

        Set united = obj.union(s1, s2);
        System.out.println(united);
    }
}
