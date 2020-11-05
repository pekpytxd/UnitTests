package tests;

import java.util.HashSet;
import java.util.Set;

public class OperationsSets {
    public Set union(Set s1, Set s2) {
        Set newSet = new HashSet(s1);
        newSet.addAll(s2);
        return newSet;
    }

    public Set intersect(Set s1, Set s2) {
        Set newSet = new HashSet(s1);
        newSet.retainAll(s2);
        return s2;
    }
}
